package edu.greenriver.sdev.jokesapi.controllers;

import edu.greenriver.sdev.jokesapi.model.Joke;
import edu.greenriver.sdev.jokesapi.services.JokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JokesApi
{
    private JokeService service;

    public JokesApi(JokeService service)
    {
        this.service = service;
    }

    @GetMapping("jokes") //http://localhost:8080/jokes
    public List<Joke> allJokes()
    {
        return service.getAllJokes();
    }
}
