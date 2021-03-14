public class RubberDuck implements Quacking {
    Observed observed;

    public RubberDuck() {
        this.observed = new Observed(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak! Squeak!");
        noticeObservers();
    }

    @Override
    public void registerObserver(DuckObserver observer) {
        observed.registerObserver(observer);
    }

    @Override
    public void noticeObservers() {
        observed.noticeObservers();
    }
}
