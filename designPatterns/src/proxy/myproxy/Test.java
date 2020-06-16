package proxy.myproxy;

import proxy.jdk.Person;
import proxy.jdk.Teacher;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author light
 * @date 16/6/2020 上午 9:47
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, IOException {
        //
        Person p = (Person) new MyHandler().getInstance(new Teacher());
        p.study();
    }
}
