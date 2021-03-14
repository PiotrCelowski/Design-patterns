public class BlaupunktSpeakers implements Speakers {
    public BlaupunktSpeakers() {
    }

    @Override
    public void soundOn() {
        System.out.println("Speakers are on!");
    }

    @Override
    public void soundOff() {
        System.out.println("Speakers are off!");
    }
}
