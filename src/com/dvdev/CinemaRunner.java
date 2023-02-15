package com.dvdev;

public class CinemaRunner {

    public static void main(String[] args) {
        Movie m1 = new Movie(1, 1987, 2, "Action", 9.5);
        Movie m2 = new Movie(2, 1987, 4, "Horror", 6.5);
        Movie m3 = new Movie(3, 1999, 11, "Comedy", 4.0);
        Movie m4 = new Movie(4, 2001, 3, "Thriller", 8.5);
        Movie m5 = new Movie(5, 2001, 4, "Action", 6.5);
        Movie m6 = new Movie(6, 2004, 11, "Fantasy", 9.5);
        Movie m7 = new Movie(7, 2005, 1, "Comedy", 7.5);
        Movie m8 = new Movie(8, 2004, 7, "Fantasy", 8.5);
        Movie m9 = new Movie(9, 2004, 8, "Horror", 3.5);
        Movie m10 = new Movie(10, 2014, 9, "Fantasy", 3.0);
        Movie m11 = new Movie(11, 2011, 10, "Documental", 10);

        Cinema cinema = new Cinema();
        cinema.addMovie(m1);
        cinema.addMovie(m2);
        cinema.addMovie(m3);
        cinema.addMovie(m4);
        cinema.addMovie(m5);
        cinema.addMovie(m6);
        cinema.addMovie(m7);
        cinema.addMovie(m8);
        cinema.addMovie(m9);
        cinema.addMovie(m10);
        cinema.addMovie(m11);

        System.out.println(cinema);
        System.out.println("------------------------------");

        cinema.addMovie(new Movie(11, 2011, 10, "Documental", 10));
        System.out.println(cinema);
        System.out.println("------------------------------");

        cinema.getMovieByYear(1987);
        System.out.println("------------------------------");

        cinema.getMovieByYearAndMonth(1987,2);
        System.out.println("------------------------------");

        cinema.getMovieByGenre("Action");
        System.out.println("------------------------------");

        cinema.getTop10MoviesByRating();

    }
}
