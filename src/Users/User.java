package Users;

import java.util.Vector;
import Movie.*;
abstract public class User {
    private Vector<Movie> movies;
    private String name;
    User() {
        movies = new Vector<Movie>();
    }
    public void addMovieToUser(Movie movie) {
        movies.add(movie);
    }
    User(String name) {
        setName(name);
        movies = new Vector<Movie>();
    }

    public Vector<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Vector<Movie> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
