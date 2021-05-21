import Users.User;
import Users.UserFactory;
import Users.Viewer;

import java.util.Vector;

public class UserService {
    private Vector<User> users = null;
    private UserFactory userFactory = null;
    UserService() {
        userFactory = new UserFactory();
    }
    public void addUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getName().equals(name)) {
                System.out.println("User already exists");
                return;
            }
        }
        users.add(userFactory.createUser(name));
        return;
    }
    public void addReview(String userName, String movieName, int rating) {

    }
    public void listReview(String name) {
        boolean printed = false;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getName().equals(name)) {
                printed = true;
                for(int j = 0; j < users.get(j).getMovies().size(); j++) {
                    System.out.println(users.get(i).getMovies().get(j).getName() + ": ");
                }
            }
        }
        if(printed == false) {
            System.out.println("User Doesn't exist");
        }
        return;
    }
    public User getUser(String userName) {
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getName().equals(userName)) {
                return users.get(i);
            }
        }
        return null;
    }
}
