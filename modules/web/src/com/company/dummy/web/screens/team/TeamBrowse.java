package com.company.dummy.web.screens.team;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Team;

@UiController("dummy$Team.browse")
@UiDescriptor("team-browse.xml")
@LookupComponent("teamsTable")
@LoadDataBeforeShow
public class TeamBrowse extends StandardLookup<Team> {
}