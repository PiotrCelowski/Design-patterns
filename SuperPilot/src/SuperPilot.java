import commands.Command;
import commands.NoCommand;

public class SuperPilot implements Pilot {
    Command[] commandsSwitchOff;
    Command[] commandsSwitchOn;
    Command commandUndo;

    public SuperPilot() {
        commandsSwitchOff = new Command[10];
        commandsSwitchOn = new Command[10];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 10; i++) {
            commandsSwitchOn[i] = noCommand;
            commandsSwitchOff[i] = noCommand;
        }

        commandUndo = noCommand;
    }

    @Override
    public void setCommand (int socket, Command commandOn, Command commandOff) {
        commandsSwitchOn[socket] = commandOn;
        commandsSwitchOff[socket] = commandOff;
    }

    @Override
    public void buttonClicked(int socket) {
        commandsSwitchOn[socket].execute();
        commandUndo = commandsSwitchOn[socket];
    }

    @Override
    public void buttonUnclicked(int socket) {
        commandsSwitchOff[socket].execute();
        commandUndo = commandsSwitchOff[socket];
    }

    @Override
    public void buttonUndo() {
        commandUndo.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------SuperPilot-------\n");
        for(int i = 0; i < commandsSwitchOn.length; i++) {
            stringBuff.append("[socket " + i + "] " + commandsSwitchOn[i].getClass().getName()
                    + " " + commandsSwitchOff[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
