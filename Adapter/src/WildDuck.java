public class WildDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Kwa kwa");
    }

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
