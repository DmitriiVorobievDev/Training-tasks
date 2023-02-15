package com.dvdev;

import java.util.*;

public class Cinema {

    Map<Integer, List<Movie>> movies = new HashMap<>();

    public void addMovie(Movie movie) {
        if (movies.containsKey(movie.getYearOfRelease())) {
            List<Movie> list = new ArrayList<>();
            List<Movie> tempList1 = new ArrayList<>(movies.get(movie.getYearOfRelease()));
            for (Movie movie1 : tempList1) {
                if (movie1.equals(movie)) {
                    continue;
                } else {
                    list.add(movie);
                    movies.put(movie.getYearOfRelease(), list);
                }
            }
        } else {
            List<Movie> tempList2 = new ArrayList<>();
            tempList2.add(movie);
            movies.put(movie.getYearOfRelease(), tempList2);
        }
    }

    public void getMovieByYear(int yearOfRelease) {
        if (movies.containsKey(yearOfRelease)) {
            System.out.println("Movies by year: " + yearOfRelease + ":");
            System.out.println(movies.get(yearOfRelease));
        } else {
            System.out.println("There are no movies released this year");
        }

    }

    public void getMovieByYearAndMonth(int yearOfRelease, int monthOfRelease) {
        if (movies.containsKey(yearOfRelease)) {
            List<Movie> tempShowList = new ArrayList<>();
            List<Movie> tempList = new ArrayList<>(movies.get(yearOfRelease));
            for (Movie movie : tempList) {
                if (movie.getMonthOfRelease() == monthOfRelease) {
                    tempShowList.add(movie);
                }
            }
            if (tempShowList.size() == 0) {
                System.out.println("There are no movies released these year and month");
            } else {
                System.out.println("Movies released by year: " + yearOfRelease + " and month: " + monthOfRelease + ":");
                System.out.println(tempShowList);
            }
        } else {
            System.out.println("There are no movies released these year and month");
        }
    }

    public void getMovieByGenre(String genre) {
        List<Movie> tempShowList = new ArrayList<>();
        for (Map.Entry<Integer, List<Movie>> entry : movies.entrySet()) {
            List<Movie> tempList = entry.getValue();
            for (Movie movie : tempList) {
                if (movie.getGenre().equals(genre)) {
                    tempShowList.add(movie);
                }
            }
        }
        if (tempShowList.size() > 0) {
            System.out.println("Movies with a genre: " + genre + ":");
            System.out.println(tempShowList);
        } else {
            System.out.println("There are no movies this genre");
        }
    }

    public void getTop10MoviesByRating() {
        List<Movie> tempShowList = new ArrayList<>();
        for (Map.Entry<Integer, List<Movie>> entry : movies.entrySet()) {
            List<Movie> tempList = entry.getValue();
            tempShowList.addAll(tempList);
        }
        if (tempShowList.size() < 10) {
            System.out.println("The movies amount in our cinema is less than 10");
        } else {
            Collections.sort(tempShowList);
            List<Movie> list = tempShowList.subList(0, 10);
            System.out.println("TOP 10 Movies: " + list);
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "movies=" + movies +
                '}';
    }
}
