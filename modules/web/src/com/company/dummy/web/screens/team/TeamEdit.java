package com.company.dummy.web.screens.team;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Team;

@UiController("dummy$Team.edit")
@UiDescriptor("team-edit.xml")
@EditedEntityContainer("teamDc")
@LoadDataBeforeShow
public class TeamEdit extends StandardEditor<Team> {
}