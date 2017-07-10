package ioc;

/**
 * Created by liuhang on 2017/3/30.
 */
public class UserService {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void printUser() {
        System.out.println(this.user.getName());
    }
}
