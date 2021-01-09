package proxy.cglib;

/**
 * @author light
 * @date 16/6/2020 下午 10:09
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //
        Teacher t = (Teacher) new MyInterceptor().getInstance(Teacher.class);
        t.study();
    }
}
