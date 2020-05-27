package com.company.dummy.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum CompetitorsType implements EnumClass<Integer> {
    INDIVIDUAL(10),
    TEAM(20);

    private Integer id;

    CompetitorsType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static CompetitorsType fromId(Integer id) {
        for (CompetitorsType at : CompetitorsType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}