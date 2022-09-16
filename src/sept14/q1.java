package sept14;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class q1 {

    /*
    1. Get all the List of Movies the belongs to the category of "Thriller" with in the range of 1960 to 1980
    */

        public static void main(String[] args) {
            // 1960-1980
            List<Movie> movieList = new ArrayList<>();
            movieList.add(new Movie("Chalti ka naam gaadi","Comedy",1990));
            movieList.add(new Movie("Mughal-E-Azam","Romance",1955));
            movieList.add(new Movie("The Godfather","Thriller",1973));
            movieList.add(new Movie("Sholay","Thriller",1975));
            movieList.add(new Movie("Poorab aur Paschim","Romance",1963));

            List<String> requiredMovieList = movieList.stream()
                    .filter(s -> s.getCategory() == "Thriller")
                    .filter(s -> s.getReleaseYear()>1960 && s.getReleaseYear()<1980)
                    .map(s -> s.getName()).collect(Collectors.toList());

            System.out.println(requiredMovieList);
        }

}
class Movie{
    String name;
    String category;
    int releaseYear;
    public Movie(String name, String category, int releaseDate) {
        this.name = name;
        this.category = category;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getReleaseYear() {
        return getReleaseYear();
    }

    /*@Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", releaseDate=" + releaseYear +
                '}';
    }*/
}