package com.company.dummy.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@NamePattern("%s|name")
@Table(name = "DUMMY_COMPETITION")
@Entity(name = "dummy$Competition")
public class Competition extends StandardEntity {
    private static final long serialVersionUID = 5709616984656759259L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @JoinTable(name = "DUMMY_COMPETITION_JUDGE_LINK",
            joinColumns = @JoinColumn(name = "COMPETITION_ID"),
            inverseJoinColumns = @JoinColumn(name = "JUDGE_ID"))
    @ManyToMany
    protected Set<Judge> judges;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SPORT_ID")
    protected Sport sport;

    @OneToMany(mappedBy = "competition")
    protected Set<Participant> participants;

    @Column(name = "COMPETITORS_TYPE")
    protected Integer competitorsType;

    public Set<Judge> getJudges() {
        return judges;
    }

    public void setJudges(Set<Judge> judges) {
        this.judges = judges;
    }

    public CompetitorsType getCompetitorsType() {
        return competitorsType == null ? null : CompetitorsType.fromId(competitorsType);
    }

    public void setCompetitorsType(CompetitorsType competitorsType) {
        this.competitorsType = competitorsType == null ? null : competitorsType.getId();
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}