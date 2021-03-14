public class WildDuck implements Quacking {
    Observed observed;

    public WildDuck() {
        this.observed = new Observed(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
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
