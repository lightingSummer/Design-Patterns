package 命令模式;

import java.util.Objects;
import java.util.UUID;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class CommandMessage {
    private Boolean isValid;
    private Command command;
    private String commandId;

    public CommandMessage(LightOperation lightOperation, Light light) {
        Command command;
        if (lightOperation == LightOperation.ON) {
            command = new LightOnCommand(light);
        } else {
            command = new LightOffCommand(light);
        }
        isValid = true;
        commandId = UUID.randomUUID().toString();
        this.command = command;
    }

    public String getCommandId() {
        return commandId;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public Command getCommand() {
        return command;
    }

    public Boolean getValid() {
        return isValid;
    }

    @Override
    public String toString() {
        return "CommandMessage{" +
                "isValid=" + isValid +
                ", command=" + command +
                ", commandId='" + commandId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommandMessage)) return false;
        CommandMessage that = (CommandMessage) o;
        return Objects.equals(isValid, that.isValid) &&
                Objects.equals(command, that.command) &&
                Objects.equals(commandId, that.commandId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isValid, command, commandId);
    }
}
