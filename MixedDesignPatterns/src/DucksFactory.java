public class DucksFactory extends AbstractDuckFactory {
    @Override
    public Quacking createWildDuck() {
        return new WildDuck();
    }

    @Override
    public Quacking createShoveller() {
        return new Shoveller();
    }

    @Override
    public Quacking createDecoy() {
        return new Decoy();
    }

    @Override
    public Quacking createRubberDuck() {
        return new RubberDuck();
    }
}
