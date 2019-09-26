package com.qa.models;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String team;
    int rating;
    String role;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public String getPlayerTeam() {
        return team;
    }

    public void setPlayerTeam(String playerTeam) {
        this.team = team;
    }

    public int getPlayerRating() {
        return rating;
    }

    public void setPlayerRating(int rating) {
        this.rating = rating;
    }

    public String getPlayerRole() {
        return role;
    }

    public void setPlayerRole(String playerRole) {
        this.role = role;
    }




    public void updateAll(Players player){
        this.name = player.getPlayerName();
        this.team = player.getPlayerTeam();
        this.rating = player.getPlayerRating();
        this.role = player.getPlayerRole();
    }
}

