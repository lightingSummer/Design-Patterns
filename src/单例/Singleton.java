package 单例;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/23 0023
 * @description： 饿汉式，不会造成线程不安全，因为最开始就初始化了
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }
}
