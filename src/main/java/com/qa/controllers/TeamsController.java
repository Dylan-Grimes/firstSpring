package com.qa.controllers;

import com.qa.models.Teams;

import com.qa.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class TeamsController {

    @Autowired
    private TeamsRepository repository;

    @RequestMapping(value = "teams", method = RequestMethod.GET)
    public List<Teams> listAllTeams() {
        return repository.findAll();
    }

    @RequestMapping(value = "teams", method = RequestMethod.POST)
    public Teams addTeam(@RequestBody Teams team) {
        return repository.saveAndFlush(team);
    }

    @RequestMapping(value = "teams/{id}", method = RequestMethod.GET)
    public Teams getTeam(@PathVariable Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(value = "teams/{id}", method = RequestMethod.DELETE)
    public Teams deleteTeam(@PathVariable Long id) {
        Teams existing = repository.findOne(id);
        repository.delete(existing);
        return existing;
    }

    @RequestMapping(value = "teams/deleteAllTeams", method = RequestMethod.DELETE)
    public List<Teams> deleteAllTeams() {
        List all = repository.findAll();
        repository.delete(all);
        return all;
    }

}
