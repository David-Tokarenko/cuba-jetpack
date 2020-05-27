package com.company.dummy.web.screens.sportsman;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Sportsman;

@UiController("dummy$Sportsman.browse")
@UiDescriptor("sportsman-browse.xml")
@LookupComponent("sportsmenTable")
@LoadDataBeforeShow
public class SportsmanBrowse extends StandardLookup<Sportsman> {
}