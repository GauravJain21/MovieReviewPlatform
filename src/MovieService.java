import Users.User;
import kotlin.Pair;

import java.util.*;

import Movie.*;

public class MovieService {
    private Vector<Movie> movies;

    public boolean addMovie(Movie movie) {
        for(int i = 0; i < movies.size(); i++) {
            if(movie.getName().equals(movies.get(i).getName())) {
                System.out.println("Movie already exists in DB");
                return false;
            }
        }
        movies.add(movie);
        return true;
    }

    public void listReviewByYear(int year, int count) {
        LinkedHashSet<Pair<Double, Movie>> topMovies = new LinkedHashSet<>();
        for(int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getYear() == year) {
                double currRating = movies.get(i).getCurrentRating();
                topMovies.add(new Pair<Double, Movie>(currRating, movies.get(i)));
                if(topMovies.size() > count) {
                    topMovies.remove(topMovies.iterator().next());
                }
            }
        }
        for(Pair<Double, Movie> currMovie: topMovies) {
            System.out.println(currMovie.getSecond().getName() + " has rating " + currMovie.getSecond());
        }
        return;
    }
    public void listReviewByGenre(String genre, int count) {
        LinkedHashSet<Pair<Double, Movie>> topMovies = new LinkedHashSet<>();
        for(int i = 0; i < movies.size(); i++) {
            if(Arrays.asList(movies.get(i).getGenres()).contains(genre)) {
                double currRating = movies.get(i).getCurrentRating();
                topMovies.add(new Pair<Double, Movie>(currRating, movies.get(i)));
                if(topMovies.size() > count) {
                    topMovies.remove(topMovies.iterator().next());
                }
            }
        }
        for(Pair<Double, Movie> currMovie: topMovies) {
            System.out.println(currMovie.getSecond().getName() + " has rating " + currMovie.getSecond());
        }
        return;
    }
    public Movie getMovie(String movieName) {
        for(int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getName().equals(movieName)) {
                return movies.get(i);
            }
        }
        return null;
    }

}
