package 观察者模式1;

/**
 * @author     ：lightingSummer
 * @date       ：2019/8/20 0020
 * @description：
 */
public interface Watched {
    void addWatcher(Watcher watcher);

    void removeWatcher(Watcher watcher);

    void notifyWatchers(String str);
}
