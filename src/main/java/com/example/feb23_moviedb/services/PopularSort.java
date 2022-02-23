package com.example.feb23_moviedb.services;

import com.example.feb23_moviedb.models.Movie;

import java.util.Comparator;

public class PopularSort implements Comparator<Movie>
{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getPopularity() - o1.getPopularity();
    }
}