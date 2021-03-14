package commands;

import HomeFeatures.Light;

public class CommandLightOff implements Command {
    Light light;

    public CommandLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnLightOff();
    }

    @Override
    public void undo() {
        light.turnLightOn();
    }
}
