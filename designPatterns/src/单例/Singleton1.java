package 单例;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/23 0023
 * @description： 懒汉式--双重校验锁
 */
public class Singleton1 {
    private Singleton1() {
    }

    // volatile禁止指令重排序，防止一个线程获得空对象
    private volatile static Singleton1 singleton1;

    public static Singleton1 getSingleton1() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(getSingleton1().hashCode())).start();
        }
    }
}
