package 命令模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}