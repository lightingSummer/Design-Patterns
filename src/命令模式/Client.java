package 命令模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Invoke invoke = new Invoke();
        for (int i = 0; i < 10; i++) {
            CommandMessage commandMessage;
            if (i % 2 == 0) {
                commandMessage = new CommandMessage(LightOperation.ON, light);
            } else {
                commandMessage = new CommandMessage(LightOperation.OFF, light);
            }
            invoke.addTask(commandMessage);
            if (i % 3 == 0) {
                invoke.removeTask(commandMessage);
            }
        }
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    if (invoke.hasTask()) {
                        CommandMessage commandMessage = invoke.getTask();
                        if (commandMessage.getValid()) {
                            System.out.println("任务开始执行"+commandMessage.getCommandId());
                            commandMessage.getCommand().execute();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
