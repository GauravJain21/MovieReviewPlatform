import Movie.Movie;
import Users.User;

public class MovieReviewPlatform {
    private MovieService movieService;
    private UserService userService;
    MovieReviewPlatform() {
        this.movieService = new MovieService();
        this.userService = new UserService();
    }
    public void listReviewByGenre(String genre, int count) {
        movieService.listReviewByGenre(genre, count);
        return;
    }
    public void listReviewByYear(int year, int count) {
        movieService.listReviewByYear(year, count);
        return;
    }
    public void addMovie(String[] args) {
        movieService.addMovie(new Movie(args));
        return;
    }
    public void addUser(String name) {
        userService.addUser(name);
    }
    public void listReview(String userName) {
        userService.listReview(userName);
        return;
    }
    public void addReview(String userName, String movieName, int rating) {
        User user = userService.getUser(userName);
        Movie movie = movieService.getMovie(movieName);
        if(user == null) {
            System.out.println("user doesn't exist");
        }
        else if(movie == null) {
            System.out.println("movie doesn't exist");
        }
        else {
            System.out.println("review added");
            user.addMovieToUser(movie);
            movie.addUserToMovie(user, rating);
        }
        return;
    }

}
