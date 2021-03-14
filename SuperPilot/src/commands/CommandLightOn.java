package commands;

import HomeFeatures.Light;

public class CommandLightOn implements Command {
    Light light;

    public CommandLightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnLightOn();
    }

    @Override
    public void undo() {
        light.turnLightOff();
    }
}
