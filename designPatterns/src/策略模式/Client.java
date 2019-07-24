package 策略模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description： Jdk中的TreeSet和 TreeMap的排序功能就是使用了策略模式。
 */
public class Client {
    public static void main(String[] args) {
        FatMan fatMan = new FatMan(new EatBehavior());
        fatMan.move();
        fatMan.setBehavior(new SleepBehavior());
        fatMan.move();
    }
}
