package com.qa.controllers;


import com.qa.models.Teams;
import com.qa.repository.TeamsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TeamsControllerTest {

    @InjectMocks
    private TeamsController teamsController;

    @Mock
    private TeamsRepository repository;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllTeams() {
        List<Teams> teamsList = new ArrayList<>();
        Teams teams = new Teams();
        teams.setTeamName("name");
        teams.setTeamRating(100);
        teamsList.add(teams);


        when(repository.findAll()).thenReturn(teamsList);
        assertEquals(teamsController.listAllTeams().get(0).getTeamName(), "name");
    }

    @Test
    public void testAddTeam() {
        Teams teams = new Teams();
        when(!repository.exists(1L)).thenReturn(false);
        teamsController.addTeam(teams);
        teams.setTeamName("name");
        when(repository.exists(1L)).thenReturn(true);
    }

    @Test
    public void testGetTeam() {
        Teams teams = new Teams();
        teams.setTeamName("name");
        when(repository.findOne(1L)).thenReturn(teams);
        teamsController.getTeam(1L);
    }

    @Test
    public void testDeleteTeams() {
        Teams teams = new Teams();
        teams.setTeamName("name");
        repository.findOne(1L);
        teamsController.deleteTeam(1L);
        when(!repository.exists(1L)).thenReturn(true);
    }

    @Test
    public void testDeleteAllTeams() {

    }

}
