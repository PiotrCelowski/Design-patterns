public class QuackCounterFactory extends AbstractDuckFactory {
    @Override
    public Quacking createWildDuck() {
        return new QuackCounter(new WildDuck());
    }

    @Override
    public Quacking createShoveller() {
        return new QuackCounter(new Shoveller());
    }

    @Override
    public Quacking createDecoy() {
        return new QuackCounter(new Decoy());
    }

    @Override
    public Quacking createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
