package com.company.dummy.web.screens.competitor;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Competitor;

@UiController("dummy$Competitor.browse")
@UiDescriptor("competitor-browse.xml")
@LookupComponent("competitorsTable")
@LoadDataBeforeShow
public class CompetitorBrowse extends StandardLookup<Competitor> {
}