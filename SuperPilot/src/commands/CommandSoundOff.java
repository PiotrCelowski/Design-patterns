package commands;

import HomeFeatures.Speakers;

public class CommandSoundOff implements Command {
    Speakers speakers;

    public CommandSoundOff(Speakers speakers) {
        this.speakers = speakers;
    }

    @Override
    public void execute() {
        speakers.soundOff();
    }

    @Override
    public void undo() {
        speakers.soundOn();
    }
}
