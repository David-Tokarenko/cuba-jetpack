package com.company.dummy.web.screens.competition;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Competition;

@UiController("dummy$Competition.browse")
@UiDescriptor("competition-browse.xml")
@LookupComponent("competitionsTable")
@LoadDataBeforeShow
public class CompetitionBrowse extends StandardLookup<Competition> {
}