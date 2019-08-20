package 策略模式1;

/**
 * @author     ：lightingSummer
 * @date       ：2019/8/20 0020
 * @description：
 */
public class Context {
    private Strategy strategy;

    private Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy() {
        strategy.doSomething();
    }
}
