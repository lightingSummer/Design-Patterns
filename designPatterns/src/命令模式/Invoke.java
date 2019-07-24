package 命令模式;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class Invoke {
    private Queue<CommandMessage> queue = new LinkedList<>();

    public void addTask(CommandMessage commandMessage) {
        queue.offer(commandMessage);
        System.out.println("加入队列" + commandMessage);
    }

    public void removeTask(CommandMessage commandMessage){
        if(commandMessage != null){
            commandMessage.setValid(false);
            System.out.println("任务取消"+commandMessage);
        }else {
            System.out.println("任务不存在");
        }
    }

    public boolean hasTask(){
        return !queue.isEmpty();
    }

    public CommandMessage getTask(){
        return queue.poll();
    }
}
