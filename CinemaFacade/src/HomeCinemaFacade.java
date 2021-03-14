public class HomeCinemaFacade {
    PopcornMachine popcorn;
    Screen screen;
    Speakers speakers;
    Projector projector;

    public HomeCinemaFacade(PopcornMachine popcorn, Screen screen, Speakers speakers, Projector projector) {
        this.popcorn = popcorn;
        this.screen = screen;
        this.speakers = speakers;
        this.projector = projector;
    }

    public void startTheCinema() {
        popcorn.doPopcorn();
        popcorn.servePopcorn();
        screen.screenDown();
        speakers.soundOn();
        projector.projectorOn();
    }

    public void stopTheCinema() {
        popcorn.stopMachine();
        projector.projectorOff();
        screen.screenUp();
        speakers.soundOff();
    }
}
