package com.company.dummy.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.dummy.entity.Country;

@UiController("dummy$Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CountryBrowse extends MasterDetailScreen<Country> {
}