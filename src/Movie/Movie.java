package Movie;

import Users.User;
import kotlin.Pair;

import java.util.Arrays;
import java.util.Vector;

public class Movie {
    private String name;
    private String[] genres;
    private int year;
    private Vector<Pair<User, Integer>> users;
    public Movie(String[] args) {
        setName(args[1]);
        setYear(Integer.parseInt(args[2]));
        setGenres(Arrays.copyOfRange(args, 3, args.length));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public double getCurrentRating() {
        double totalRating = 0;
        int denominator = 0;
        for(int i = 0; i < users.size(); i++) {
            totalRating += users.get(i).
        }
    }
    public void addUserToMovie(User user, int rating) {
        users.add(new Pair<>(user, rating));
    }
}
