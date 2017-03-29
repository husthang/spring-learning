package proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

import proxy.share.MyAspect;

/**
 * Created by liuhang on 2017/2/15.
 */
public class MyBeanFactory {
    public static UserServiceImpl createUserService(){
        final UserServiceImpl userService = new UserServiceImpl();
        final MyAspect aspect = new MyAspect();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userService.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy
                    methodProxy) throws Throwable {
                aspect.before();
                Object o1 = method.invoke(userService, objects);
                methodProxy.invokeSuper(o, objects);
                aspect.after();
                return o1;
            }
        });

        return (UserServiceImpl) enhancer.create();
    }
}
