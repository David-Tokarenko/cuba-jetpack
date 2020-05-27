package com.company.dummy.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@NamePattern("%s|name")
@Table(name = "DUMMY_JUDGE")
@Entity(name = "dummy$Judge")
public class Judge extends StandardEntity {
    private static final long serialVersionUID = -1485108060683583860L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SPORT_ID")
    @Lookup(type = LookupType.DROPDOWN)
    protected Sport sport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    @Lookup(type = LookupType.DROPDOWN)
    protected Country country;
    @JoinTable(name = "DUMMY_COMPETITION_JUDGE_LINK",
            joinColumns = @JoinColumn(name = "JUDGE_ID"),
            inverseJoinColumns = @JoinColumn(name = "COMPETITION_ID"))
    @ManyToMany
    protected Set<Competition> competitions;

    public Set<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}