package com.example.feb23_moviedb.services;

import com.example.feb23_moviedb.models.Movie;
import com.example.feb23_moviedb.repositories.MovieDB;

import java.util.*;

public class MovieService
{
    Random ran = new Random();
    MovieDB movieDB = new MovieDB();

    ArrayList<Movie> listOfMovies = movieDB.getListOfMovies();

    public Movie getFirstMovie() {
        return listOfMovies.get(0);
    }

    public Movie getRandomMovie() {
        return listOfMovies.get(ran.nextInt(listOfMovies.size() + 1));
    }

    public ArrayList<Movie> getRandomTenSortPopular() {

        ArrayList<Movie> moviesSortedPopular = new ArrayList<Movie>();
        HashSet<Integer> setOfUniqueNumbers = new HashSet<Integer>();

        int setOfNumbersSize = setOfUniqueNumbers.size();

        for (int i = 0; i < 50; i++) {
            setOfUniqueNumbers.add(ran.nextInt(listOfMovies.size() + 1));
        }

        Iterator<Integer> it = setOfUniqueNumbers.iterator();
        System.out.println(setOfUniqueNumbers.size());

        for (int i = 0; i < 10; i++) {
            moviesSortedPopular.add(listOfMovies.get(it.next()));
        }

        Collections.sort(moviesSortedPopular, new PopularSort());

        return moviesSortedPopular;
    }

    public int getWonAwards() {
        int awardWon = 0;

        for (Movie movie : listOfMovies
        ) {
            if (movie.getAward().toLowerCase().equals("yes")) {
                awardWon++;
            }
        }

        return awardWon;
    }
}
