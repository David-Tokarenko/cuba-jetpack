package com.company.dummy.web.screens.competitor;

import com.haulmont.chile.core.model.MetaClass;
import com.haulmont.chile.core.model.Session;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.app.core.inputdialog.DialogActions;
import com.haulmont.cuba.gui.app.core.inputdialog.InputDialog;
import com.haulmont.cuba.gui.app.core.inputdialog.InputParameter;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Competitor;
import com.haulmont.cuba.gui.screen.LookupComponent;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@UiController("dummy$Competitor.browse")
@UiDescriptor("competitor-browse.xml")
@LookupComponent("competitorsTable")
@LoadDataBeforeShow
public class CompetitorBrowse extends StandardLookup<Competitor> {

    @Inject
    private Dialogs dialogs;
    @Inject
    private UiComponents uiComponents;
    @Inject
    private Metadata metadata;
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private Messages messages;

    @Subscribe("competitorsTable.create")
    public void onCompetitorsTableCreate(Action.ActionPerformedEvent event) {

        Session session = metadata.getSession();
        MetaClass metaClasses = session.getClassNN(Competitor.class);
        Collection<MetaClass> descendants = metaClasses.getDescendants();
        List<Object> descendantsList = new ArrayList<>();
        for (MetaClass metaClass : descendants) {
            if (metaClass.getJavaClass() != null)
                descendantsList.add(metaClass.getJavaClass());
        }

        dialogs.createInputDialog(getWindow().getFrameOwner())
                .withCaption(messages.getMessage(CompetitorBrowse.class, "dialogCaption"))
                .withParameters(
                        InputParameter.parameter("descendants")
                                .withField(() -> {
                                    //noinspection UnstableApiUsage
                                    LookupField<Object> field = uiComponents.create(
                                            LookupField.of(Object.class));
                                    field.setOptionsList(descendantsList);
                                    field.setCaption(messages.getMessage(CompetitorBrowse.class, "browseCaption"));
                                    field.setWidthFull();
                                    return field;
                                }))
                .withActions(DialogActions.OK_CANCEL)
                .withCloseListener(closeEvent -> {
                    if (closeEvent.getCloseAction().equals(InputDialog.INPUT_DIALOG_OK_ACTION)) {
                        if ((closeEvent.getValue("descendants") != null)) {
                            //noinspection ConstantConditions
                            Screen editor = screenBuilders.editor(closeEvent.getValue("descendants"),
                                    getWindow().getFrameOwner())
                                    .newEntity()
                                    .build();
                            editor.show();
                        }
                    }
                })
                .show();
    }
}