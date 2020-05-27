package com.company.dummy.web.screens.sportsman;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Sportsman;

@UiController("dummy$Sportsman.edit")
@UiDescriptor("sportsman-edit.xml")
@EditedEntityContainer("sportsmanDc")
@LoadDataBeforeShow
public class SportsmanEdit extends StandardEditor<Sportsman> {
}