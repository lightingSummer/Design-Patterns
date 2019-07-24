package 策略模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class FatMan {
    private Behavior behavior;

    public FatMan(Behavior behavior) {
        this.behavior = behavior;
    }

    public void move(){
        behavior.doSomething();
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }
}
