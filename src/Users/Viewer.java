package Users;

public class Viewer extends User {
    Viewer(String name) {
        super(name);
    }
    Viewer() {

    }
    Viewer(User user) {
        User newUser = new Viewer();
        newUser.setName(user.getName());
        newUser.setMovies(user.getMovies());
    }
}
