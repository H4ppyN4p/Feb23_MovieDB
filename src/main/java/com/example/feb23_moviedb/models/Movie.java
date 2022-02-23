package com.example.feb23_moviedb.models;

public class Movie
{
    int year;
    int length;
    String title;
    String subject;
    int popularity;
    String awards;

    public Movie(int year, int length, String title, String subject, int popularity, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getAward() {
        return awards;
    }

    @Override
    public String toString() {
        return "movie{" +
                "year=" + year +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", awards=" + awards +
                '}';
    }
}
