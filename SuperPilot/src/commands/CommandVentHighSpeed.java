package commands;

import HomeFeatures.Ventilation;

public class CommandVentHighSpeed implements Command {
    Ventilation ventilation;
    int previousSpeed;

    public CommandVentHighSpeed(Ventilation ventilation) {
        this.ventilation = ventilation;
    }

    @Override
    public void execute() {
        previousSpeed = ventilation.getGear();
        ventilation.setHighSpeed();
    }

    @Override
    public void undo() {
        switch(previousSpeed) {
            case 0:
                ventilation.ventOff();
            case 1:
                ventilation.setLowSpeed();
            case 2:
                ventilation.setMediumSpeed();
            case 3:
                ventilation.setHighSpeed();
            default:
                ventilation.ventOff();
        }
    }
}
