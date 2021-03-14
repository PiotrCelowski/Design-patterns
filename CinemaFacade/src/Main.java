public class Main {
    public static void main(String[] args) {
        PopcornMachine popcornMachine = new Popcorn();
        Projector projector = new PhilipsProjector();
        Screen screen = new WhiteScreen();
        Speakers speakers = new BlaupunktSpeakers();

        HomeCinemaFacade myFacade = new HomeCinemaFacade(popcornMachine, screen, speakers, projector);

        System.out.println("\nNow we will start the cinema...");
        myFacade.startTheCinema();

        System.out.println("\nNow we will stop the cinema...");
        myFacade.stopTheCinema();
    }
}
