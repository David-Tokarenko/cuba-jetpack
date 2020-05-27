package com.company.dummy.web.screens.sport;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Sport;

@UiController("dummy$Sport.browse")
@UiDescriptor("sport-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class SportBrowse extends MasterDetailScreen<Sport> {
}