package com.qa.models;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private int rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return name;
    }

    public void setTeamName(String name) {
        this.name = name;
    }

    public int getTeamRating() {
        return rating;
    }

    public void setTeamRating(int rating) {
        this.rating = rating;
    }

    public void updateAll(Teams team){
        this.name = team.getTeamName();
        this.rating = team.getTeamRating();
    }


}

