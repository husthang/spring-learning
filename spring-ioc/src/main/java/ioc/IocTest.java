package ioc;

/**
 * Created by liuhang on 2017/3/29.
 */
public class IocTest {
    public static void main(String[] args) throws Exception {
        BeanFactory factory = new XmlAppContext();
        User user = (User) factory.getBean("user");
        user.setName("haha1");
//        System.out.printf(user.getName());

        UserService userService = (UserService) factory.getBean("userService");
        userService.printUser();

    }
}
