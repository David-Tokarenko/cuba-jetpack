package com.company.dummy.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

public enum Gender implements EnumClass<Integer> {
    MALE(10),
    FEMALE(20),
    UNDEFINED(30);

    private Integer id;

    private Gender(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public static Gender fromId(Integer id) {
        for (Gender gender : Gender.values()) {
            if (gender.getId().equals(id))
                return gender;
        }
        return null;
    }
}
