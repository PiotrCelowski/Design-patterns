import HomeFeatures.GarageDoor;
import HomeFeatures.Light;
import HomeFeatures.Speakers;
import HomeFeatures.Ventilation;
import commands.*;

public class PilotProgramming {
    public static void main(String[] args) {
        SuperPilot pilot = new SuperPilot();

        //Create home features
        Light houseLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Speakers speakers = new Speakers();
        Ventilation ventilation = new Ventilation();

        //Create commands
        CommandLightOn commandLightOn = new CommandLightOn(houseLight);
        CommandLightOff commandLightOff = new CommandLightOff(houseLight);
        CommandOpenDoor commandOpenDoor = new CommandOpenDoor(garageDoor);
        CommandCloseDoor commandCloseDoor = new CommandCloseDoor(garageDoor);
        CommandSoundOn commandSoundOn = new CommandSoundOn(speakers);
        CommandSoundOff commandSoundOff = new CommandSoundOff(speakers);
        CommandVentOn commandVentOn = new CommandVentOn(ventilation);
        CommandVentOff commandVentOff = new CommandVentOff(ventilation);
        CommandVentHighSpeed commandVentHighSpeed = new CommandVentHighSpeed(ventilation);
        CommandVentMediumSpeed commandVentMediumSpeed = new CommandVentMediumSpeed(ventilation);
        CommandVentLowSpeed commandVentLowSpeed = new CommandVentLowSpeed(ventilation);

        //Set commands to sockets
        pilot.setCommand(0, commandLightOn, commandLightOff);
        pilot.setCommand(1, commandOpenDoor, commandCloseDoor);
        pilot.setCommand(2, commandSoundOn, commandSoundOff);
        pilot.setCommand(3, commandVentOn, commandVentOff);
        pilot.setCommand(4,commandVentHighSpeed, commandVentOff);
        pilot.setCommand(5,commandVentMediumSpeed, commandVentOff);
        pilot.setCommand(6,commandVentLowSpeed, commandVentOff);


        System.out.println(pilot);

        Command[] startHouseCommands = {commandLightOn, commandSoundOn, commandVentOn, commandVentHighSpeed, commandOpenDoor};
        Macro startHouseMacro = new Macro(startHouseCommands);
        Command[] stopHouseCommands = {commandVentOff, commandSoundOff, commandLightOff, commandCloseDoor};
        Macro stopHouseMacro = new Macro(stopHouseCommands);
        pilot.setCommand(7, startHouseMacro, stopHouseMacro);

        pilot.buttonClicked(7);
        System.out.println("Leaving house.....");
        pilot.buttonUndo();

    }
}
