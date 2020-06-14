package com.company.dummy.service;

import com.company.dummy.entity.Competition;
import com.company.dummy.entity.Sport;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(CompetitionService.NAME)
public class CompetitionServiceBean implements CompetitionService {

    @Inject
    protected Persistence persistence;

    @Override
    public List<Sport> getListOfSportByKind(String kind) {
        List<Sport> sportList;
        List<Sport> currentSportList = new ArrayList<>();

        try (Transaction transaction = persistence.createTransaction()) {
            TypedQuery<Sport> query = persistence.getEntityManager()
                    .createQuery("select e from dummy$Sport e", Sport.class).setViewName("_minimal");
            sportList = query.getResultList();
            transaction.commit();
        }
        sportList.forEach(sport -> {
            if (checkSportByKind(kind, sport)) {
                currentSportList.add(sport);
            }
        });
        return currentSportList;
    }

    @Override
    public Map<String, Integer> getAmountOfCompetitionByDate(List<Sport> sport) {
        List<Competition> competitionList;
        Map<String, Integer> amountOfCompetitionByDate = new HashMap<>();

        try (Transaction transaction = persistence.createTransaction()) {
            TypedQuery<Competition> query = persistence.getEntityManager()
                    .createQuery("select e from dummy$Competition e where e.sport in :sport", Competition.class).setViewName("competition-browse");
            query.setParameter("sport", sport);

            competitionList = query.getResultList();
            transaction.commit();
        }
        competitionList.forEach(competition -> {
            if (!amountOfCompetitionByDate.containsKey(competition.getDate().toInstant().toString().substring(0, 4))) {
                amountOfCompetitionByDate.put(competition.getDate().toInstant().toString().substring(0, 4), 1);
            } else {
                amountOfCompetitionByDate.put(competition.getDate().toInstant().toString().substring(0, 4),
                        amountOfCompetitionByDate.get(competition.getDate().toInstant().toString().substring(0, 4)) + 1);
            }
        });

        return amountOfCompetitionByDate;
    }

    @Override
    public boolean checkSportByKind(String kind, Sport sport) {
        boolean isContainsKind = false;
        if (sport.getAdditionalInfo() == null) {
            return isContainsKind;
        } else if (sport.getAdditionalInfo().contains(kind)) {
            isContainsKind = true;
        }
        return isContainsKind;
    }
}
