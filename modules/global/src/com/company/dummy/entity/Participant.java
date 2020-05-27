package com.company.dummy.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "DUMMY_PARTICIPANT")
@Entity(name = "dummy$Participant")
public class Participant extends StandardEntity {
    private static final long serialVersionUID = 4782117403671613550L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPETITION_ID")
    protected Competition competition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPETITIOR_ID")
    protected Competitor competitior;

    @Lob
    @Column(name = "RESULT_")
    protected String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Competitor getCompetitior() {
        return competitior;
    }

    public void setCompetitior(Competitor competitior) {
        this.competitior = competitior;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}