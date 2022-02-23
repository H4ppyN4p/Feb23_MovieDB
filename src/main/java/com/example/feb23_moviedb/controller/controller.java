package com.example.feb23_moviedb.controller;


import com.example.feb23_moviedb.models.Movie;
import com.example.feb23_moviedb.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class controller
{
    MovieService movieService = new MovieService();


    @GetMapping("/")
    public String welcome() {

        return "Hi there - welcome to this app. Here you're going to be able to see facts and data about movies";
    }

    @GetMapping("/getFirst")
    public Movie getFirst() {

        return movieService.getFirstMovie();
    }

    @GetMapping("/getRandom")
    public Movie getRandom() {
        return movieService.getRandomMovie();
    }

    @GetMapping("/getTen")
    public ArrayList<Movie> getTenRandomSort() {
        return movieService.getRandomTenSortPopular();
    }

    @GetMapping("/howManyWonAnAward")
    public int getWonAwards() {
        return movieService.getWonAwards();
    }
}
