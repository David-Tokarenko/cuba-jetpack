package com.company.dummy.service;

import com.company.dummy.entity.Sport;

import java.util.List;
import java.util.Map;


public interface CompetitionService {
    String NAME = "dummy_CompetitionService";

    List<Sport> getListOfSportByKind(String kind);

    Map<String, Integer> getAmountOfCompetitionByDate(List<Sport> sport);

    boolean checkSportByKind(String kind, Sport sport);
}