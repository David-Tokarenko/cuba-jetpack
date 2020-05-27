package com.company.dummy.web.screens.judge;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Judge;

@UiController("dummy$Judge.browse")
@UiDescriptor("judge-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class JudgeBrowse extends MasterDetailScreen<Judge> {
}