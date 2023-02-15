package com.dvdev;

import java.util.Objects;

public class Movie implements Comparable<Movie> {

    private int id;
    private int yearOfRelease;
    private int monthOfRelease;
    private String genre;
    private double rating;

    public Movie(int id, int yearOfRelease, int monthOfRelease, String genre, double rating) {
        this.id = id;
        this.yearOfRelease = yearOfRelease;
        this.monthOfRelease = monthOfRelease;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", yearOfRelease=" + yearOfRelease +
                ", monthOfRelease=" + monthOfRelease +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getMonthOfRelease() {
        return monthOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Movie o) {
        int temp;
        if (this.getRating() > o.getRating()) {
            temp = -1;
        } else if (this.getRating() < o.getRating()) {
            temp = 1;
        } else {
            temp = 0;
        }
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                yearOfRelease == movie.yearOfRelease &&
                monthOfRelease == movie.monthOfRelease
                && Double.compare(movie.rating, rating) == 0
                && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yearOfRelease, monthOfRelease, genre, rating);
    }
}
