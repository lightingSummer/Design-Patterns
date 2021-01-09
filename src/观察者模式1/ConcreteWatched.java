package 观察者模式1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author     ：lightingSummer
 * @date       ：2019/8/20 0020
 * @description：
 */
public class ConcreteWatched implements Watched {
    private List<Watcher> watchers = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watchers.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        Iterator<Watcher> it = watchers.iterator();
        while (it.hasNext()) {
            if (it.next().equals(watcher)) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public void notifyWatchers(String str) {
        for (Watcher watcher : watchers) {
            watcher.update(str);
        }
    }
}
