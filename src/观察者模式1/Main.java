package 观察者模式1;

/**
 * @author     ：lightingSummer
 * @date       ：2019/8/20 0020
 * @description：
 */
public class Main {
    public static void main(String[] args) {
        Watcher watcher1 = new ConcreteWatcher("1");
        Watcher watcher2 = new ConcreteWatcher("2");
        Watcher watcher3 = new ConcreteWatcher("3");

        Watched watched = new ConcreteWatched();
        watched.addWatcher(watcher1);
        watched.addWatcher(watcher2);
        watched.addWatcher(watcher3);
        watched.notifyWatchers("啊啊啊");

        watched.removeWatcher(watcher2);
        watched.notifyWatchers("呀呀呀");
    }
}
