package com.company.dummy.web.screens.competition;

import com.company.dummy.entity.Sportsman;
import com.haulmont.cuba.core.global.ExtendedEntities;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.core.global.ViewRepository;
import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Competition;

import javax.inject.Inject;

@UiController("dummy$Competition.edit")
@UiDescriptor("competition-edit.xml")
@EditedEntityContainer("competitionDc")
@LoadDataBeforeShow
public class CompetitionEdit extends StandardEditor<Competition> {
    @Inject
    protected Metadata metadata;
    @Inject
    protected ViewRepository viewRepository;

    @Inject
    protected ExtendedEntities extendedEntities;

    @Inject
    protected MetadataTools tools;
    @Subscribe
    protected void onAfterInit(AfterInitEvent event) {
        Sportsman sp = metadata.create(Sportsman.class);
        metadata.getSession().getClassNN("dummy$Sportsman");

    }

}