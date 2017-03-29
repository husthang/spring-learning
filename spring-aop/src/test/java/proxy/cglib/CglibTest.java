package proxy.cglib;

import org.junit.Test;

/**
 * Created by liuhang on 2017/2/15.
 */
public class CglibTest {
    @Test
    public void test() {
        UserServiceImpl userService = MyBeanFactory.createUserService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
