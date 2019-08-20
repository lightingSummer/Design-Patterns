package 策略模式1;

/**
 * @author     ：lightingSummer
 * @date       ：2019/8/20 0020
 * @description：
 */
public class Main {
    public static void main(String[] args) {
        Strategy strategy1 = new ConcreteStrategy1();
        Strategy strategy2 = new ConcreteStrategy2();

        Context context = new Context(strategy1);
        context.doStrategy();
        context = new Context(strategy2);
        context.doStrategy();
    }
}
