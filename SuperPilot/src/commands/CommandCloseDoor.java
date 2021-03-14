package commands;

import HomeFeatures.GarageDoor;

public class CommandCloseDoor implements Command {
    GarageDoor garageDoor;

    public CommandCloseDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.closeDoor();
    }

    @Override
    public void undo() {
        garageDoor.openDoor();
    }
}
