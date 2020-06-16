package proxy.myproxy;

import proxy.jdk.Person;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author light
 * @date 16/6/2020 上午 10:37
 */
public class MyHandler implements MyInvocationHandler {

    private Person target;

    public Object getInstance(Person target) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        this.target = target;
        Class clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用");
        method.invoke(this.target, args);
        System.out.println("调用完了");
        return null;
    }
}
