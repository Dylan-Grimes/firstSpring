package com.qa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    String teamName;
    Double teamRank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Double getTeamRank() {
        return teamRank;
    }

    public void setTeamRank(Double teamRank) {
        this.teamRank = teamRank;
    }

}

