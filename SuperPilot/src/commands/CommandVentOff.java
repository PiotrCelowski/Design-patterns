package commands;

import HomeFeatures.Ventilation;

public class CommandVentOff implements Command {
    Ventilation ventilation;

    public CommandVentOff(Ventilation ventilation) {
        this.ventilation = ventilation;
    }

    @Override
    public void execute() {
        ventilation.ventOff();
    }

    @Override
    public void undo() {
        ventilation.ventOn();
    }
}
