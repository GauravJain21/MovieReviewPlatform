package Users;

public class Expert extends User{
    Expert(String name) {
        super(name);
    }
    Expert() {

    }
    Expert(User user) {
        User newUser = new Expert();
        newUser.setName(user.getName());
        newUser.setMovies(user.getMovies());
    }
}
