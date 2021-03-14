public class GooseAdapter implements Quacking {
    Observed observed;
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observed = new Observed(this);
    }

    @Override
    public void quack() {
        goose.gaggle();
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
