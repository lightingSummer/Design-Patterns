package 单例;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/23 0023
 * @description： 静态内部类实现
 */
public class Singleton2 {
    private Singleton2() {
    }

    // Singleton2被加载时，SingletonHolder不会被加载到内存，直到getInstance()被调用时候
    private static class SingletonHolder {
        private static final Singleton2 singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.singleton2;
    }
}
