public class Decoy implements Quacking {
    Observed observed;

    public Decoy() {
        this.observed = new Observed(this);
    }

    @Override
    public void quack() {
        System.out.println("Fake quack!");
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
