package commands;

import HomeFeatures.Ventilation;

public class CommandVentOn implements Command {
    Ventilation ventilation;

    public CommandVentOn(Ventilation ventilation) {
        this.ventilation = ventilation;
    }

    @Override
    public void execute() {
        ventilation.ventOn();
    }

    @Override
    public void undo() {
        ventilation.ventOff();
    }
}
