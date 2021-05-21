package Users;

public class UserFactory {
    public static int VIEWER_LIMIT = 3, CRITIC_LIMIT = 10, EXPERT_LIMIT = 1000;
    public User createUser(String userType, String name) {
        User user = null;
        switch (userType) {
            case "Viewer":
                user = new Viewer(name);
                break;
            case "Critic":
                user = new Critic(name);
                break;
            case "Expert":
                user = new Expert(name);
                break;
            default:
                System.out.println("Wrong user type");
                break;
        }
        return user;
    }
    public User createUser(String name) {
        return new Viewer(name);
    }
    public User updateUser(User user) {
        User newUser = user;
        int reviewCount = user.getMovies().size();
        if(reviewCount >= 0 && reviewCount <= VIEWER_LIMIT) {
            user = new Viewer(user);
        }
        else if(reviewCount > VIEWER_LIMIT && reviewCount <= CRITIC_LIMIT) {
            user = new Critic(user);
        }
        else if(reviewCount > CRITIC_LIMIT) {
            user = new Expert(user);
        }
        return user;
    }
}
