package commands;

public class NoCommand implements Command {
    public NoCommand() {
    }

    @Override
    public void execute() {
        System.out.println("Command for this socket was not set.");
    }

    @Override
    public void undo() {
        System.out.println("Command for this socket was not set.");
    }
}
