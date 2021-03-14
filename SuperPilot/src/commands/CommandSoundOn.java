package commands;

import HomeFeatures.Speakers;

public class CommandSoundOn implements Command {
    Speakers speakers;

    public CommandSoundOn(Speakers speakers) {
        this.speakers = speakers;
    }

    @Override
    public void execute() {
        speakers.soundOn();
        speakers.setModeBluetooth();
        speakers.setVolume(8);
    }

    @Override
    public void undo() {
        speakers.soundOff();
    }
}
