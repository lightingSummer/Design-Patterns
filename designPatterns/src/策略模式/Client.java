package 策略模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class Client {
    public static void main(String[] args) {
        FatMan fatMan = new FatMan(new EatBehavior());
        fatMan.move();
        fatMan.setBehavior(new SleepBehavior());
        fatMan.move();
    }
}
