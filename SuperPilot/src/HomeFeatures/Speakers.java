package HomeFeatures;

public class Speakers {
    public Speakers() {
    }

    public void soundOn() {
        System.out.println("Sound is ON!");
    }

    public void soundOff() {
        System.out.println("Sound is OFF!");
    }

    public void setModeBluetooth() {
        System.out.println("Looking for bluetooth devices...");
    }

    public void setVolume(int i) {
        System.out.println("Set volume to: " + i);
    }
}

