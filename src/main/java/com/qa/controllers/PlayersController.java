package com.qa.controllers;

import com.qa.models.Players;
import com.qa.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class PlayersController {

    @Autowired
    private PlayersRepository repository;

    @RequestMapping(value = "players", method = RequestMethod.GET)
    public List<Players> listAllNotes() {
        return repository.findAll();
    }

    @RequestMapping(value = "players", method = RequestMethod.POST)
    public Players addPlayer(@RequestBody Players note) {
        return repository.saveAndFlush(note);
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.GET)
    public Players getPlayer(@PathVariable Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.DELETE)
    public Players deletePlayer(@PathVariable Long id) {
        Players existing = repository.findOne(id);
        repository.delete(existing);
        return existing;
    }

    @RequestMapping(value = "players/deleteAllPlayers", method = RequestMethod.DELETE)
    public List<Players> deleteAllPlayers() {
        List all = repository.findAll();
        repository.delete(all);
        return all;
        //return "all teams removed";
    }

}