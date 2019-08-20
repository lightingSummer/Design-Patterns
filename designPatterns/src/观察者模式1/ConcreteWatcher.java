package 观察者模式1;

/**
 * @author     ：lightingSummer
 * @date       ：2019/8/20 0020
 * @description：
 */
public class ConcreteWatcher implements Watcher {
    private String name;

    private ConcreteWatcher() {
    }

    public ConcreteWatcher(String name) {
        this.name = name;
    }

    @Override
    public void update(String str) {
        System.out.println(name + str);
    }
}
