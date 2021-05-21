package Users;

public class Critic extends User {
    Critic(String name) {
        super(name);
    }
    Critic() {

    }
    Critic(User user) {
        User newUser = new Critic();
        newUser.setName(user.getName());
        newUser.setMovies(user.getMovies());
    }
}
