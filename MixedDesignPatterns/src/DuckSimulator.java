import java.awt.geom.QuadCurve2D;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new QuackCounterFactory();
        duckSimulator.run(duckFactory);
    }

    void run(AbstractDuckFactory duckFactory) {
        Quacking wildDuck = duckFactory.createWildDuck();
        Quacking shoveller = duckFactory.createShoveller();
        Quacking decoy = duckFactory.createDecoy();
        Quacking rubberDuck = duckFactory.createRubberDuck();
        Quacking gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck simulator");

        DucksHerd ducksHerd = new DucksHerd();

        ducksHerd.add(wildDuck);
        ducksHerd.add(shoveller);
        ducksHerd.add(decoy);
        ducksHerd.add(rubberDuck);
        ducksHerd.add(gooseDuck);

        run(ducksHerd);

        System.out.println("\nDucks quacked: " + QuackCounter.getQuackCount() + " times.");

        System.out.println("\nDuck observers");
        DuckObserver duckObserver = new DuckObserverImpl();
        ducksHerd.registerObserver(duckObserver);

        run(ducksHerd);
    }

    void run(Quacking duck) {
        duck.quack();
    }
}
