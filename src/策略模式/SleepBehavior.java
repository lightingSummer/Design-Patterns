package 策略模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class SleepBehavior implements Behavior {
    @Override
    public void doSomething() {
        System.out.println("睡睡睡");
    }
}
