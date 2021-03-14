package commands;

import HomeFeatures.GarageDoor;

public class CommandOpenDoor implements Command {
    GarageDoor garageDoor;

    public CommandOpenDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.openDoor();
    }

    @Override
    public void undo() {
        garageDoor.closeDoor();
    }
}
