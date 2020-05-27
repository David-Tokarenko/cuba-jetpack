package com.company.dummy.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "DUMMY_COUNTRY", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_DUMMY_COUNTRY_UNQ", columnNames = {"NAME"})
})
@Entity(name = "dummy$Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = -7910168193305313468L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}