package com.qa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //autogen IDs
    Long id;
    String teamName;
    Double teamRank;
    String playerName;
    Double playerRank;
    String playerRole;

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

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Double getPlayerRank() {
        return playerRank;
    }

    public void setPlayerRank(Double playerRank) {
        this.playerRank = playerRank;
    }

    public String getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(String playerRole) {
        this.playerRole = playerRole;
    }





}
