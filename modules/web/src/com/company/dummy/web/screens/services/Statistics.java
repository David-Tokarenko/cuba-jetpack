package com.company.dummy.web.screens.services;

import com.company.dummy.entity.Sport;
import com.company.dummy.service.CompetitionService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@UiController("dummy_Statistics")
@UiDescriptor("statistics.xml")
public class Statistics extends Screen {

    @Inject
    private CompetitionService competitionService;

    @Inject
    private TextField<String> inputField;

    @Inject
    private Label<String> outputLabel;

    @Subscribe("searchBtn")
    public void onSearchBtnClick(Button.ClickEvent event) {
        if (!inputField.isEmpty()) {
            List<Sport> sportList = competitionService.getListOfSportByKind(inputField.getRawValue());
            Map<String, Integer> amountOfCompetitionByDate = competitionService.getAmountOfCompetitionByDate(sportList);
            outputLabel.setValue("Год/Кол-во соревнований: " + amountOfCompetitionByDate.toString());
        }
    }
}