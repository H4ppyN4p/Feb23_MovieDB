package com.example.feb23_moviedb.repositories;

import com.example.feb23_moviedb.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDB
{
    ArrayList<Movie> listOfMovies;

    public MovieDB() {
        this.listOfMovies = loadDB();
    }

    public ArrayList<Movie> loadDB() {

        ArrayList<Movie> moviesToAddToList = new ArrayList<Movie>();

        try {
            System.out.println("try");
            File fileToRead = new File("src/main/resources/static/imdb-data.csv");
            Scanner myReader = new Scanner(fileToRead);

            int year;
            int length;
            String title;
            String subject;
            int popularity;
            String awards;

            myReader.nextLine();

            while (myReader.hasNext()) {
                String[] splitNextLine = myReader.nextLine().split(";");

                year = Integer.parseInt(splitNextLine[0]);
                length = Integer.parseInt(splitNextLine[1]);
                title = splitNextLine[2];
                subject = splitNextLine[3];
                popularity = Integer.parseInt(splitNextLine[4]);
                awards = splitNextLine[5];

                moviesToAddToList.add(new Movie(year, length, title, subject, popularity, awards));
            }

        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
        }


        return moviesToAddToList;
    }

    public ArrayList<Movie> getListOfMovies() {
        return listOfMovies;
    }
}
