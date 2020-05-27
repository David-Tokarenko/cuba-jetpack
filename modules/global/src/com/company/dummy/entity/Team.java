package com.company.dummy.entity;

import javax.persistence.*;
import java.util.List;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@DiscriminatorValue("200")
@Table(name = "DUMMY_TEAM")
@Entity(name = "dummy$Team")
public class Team extends Competitor {
    private static final long serialVersionUID = -327613865713655216L;

    @OneToMany(mappedBy = "team")
    protected List<Sportsman> members;

    public List<Sportsman> getMembers() {
        return members;
    }

    public void setMembers(List<Sportsman> members) {
        this.members = members;
    }
}