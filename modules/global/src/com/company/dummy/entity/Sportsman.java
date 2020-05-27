package com.company.dummy.entity;

import javax.persistence.*;
import java.time.LocalDate;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@DiscriminatorValue("100")
@Table(name = "DUMMY_SPORTSMAN")
@Entity(name = "dummy$Sportsman")
public class Sportsman extends Competitor {
    private static final long serialVersionUID = 5863494888246662272L;

    @Column(name = "BIRTH_DATE")
    protected LocalDate birthDate;

    @Column(name = "GENDER")
    protected Integer gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    protected Team team;

    public Gender getGender() {
        return gender == null ? null : Gender.fromId(gender);
    }

    public void setGender(Gender gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}