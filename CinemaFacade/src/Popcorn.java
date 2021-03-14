public class Popcorn implements PopcornMachine {
    public Popcorn() {
    }

    @Override
    public void doPopcorn() {
        System.out.println("Doing popcorn!");
    }

    @Override
    public void servePopcorn() {
        System.out.println("Serving popcorn!");
    }

    @Override
    public void stopMachine() {
        System.out.println("Stop popcorn machine.");
    }
}
