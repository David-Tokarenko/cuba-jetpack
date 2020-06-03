package com.company.dummy.web.screens.competition;


import com.haulmont.chile.core.model.MetaClass;
import com.haulmont.chile.core.model.MetaProperty;
import com.haulmont.chile.core.model.Session;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Competition;

import javax.inject.Inject;
import java.util.Collection;

@UiController("dummy$Competition.browse")
@UiDescriptor("competition-browse.xml")
@LookupComponent("competitionsTable")
@LoadDataBeforeShow
public class CompetitionBrowse extends StandardLookup<Competition> {

    @Inject
    private Metadata metadata;
    @Inject
    private DataManager dataManager;
    @Inject
    private GroupTable<Competition> competitionsTable;
    @Inject
    private CollectionContainer<Competition> competitionsDc;

    @Subscribe("competitionsTable.copy")
    public void onCompetitionsTableCopy(Action.ActionPerformedEvent event) {
        if (competitionsTable.getSingleSelected() != null) {
            Session session = metadata.getSession();
            MetaClass metaClasses = session.getClassNN(Competition.class);
            Collection<MetaProperty> metaProperties = metaClasses.getOwnProperties();
            Competition copyCompetition = (Competition) metadata.create(metaClasses);
            for (MetaProperty property : metaProperties) {
                if (!property.getJavaType().isInterface())
                    copyCompetition.setValue(property.getName(),
                            competitionsTable.getSingleSelected().getValue(property.getName()),
                            false);
            }
            competitionsDc.getMutableItems().add(copyCompetition);
            dataManager.commit(copyCompetition);
        }
    }
}