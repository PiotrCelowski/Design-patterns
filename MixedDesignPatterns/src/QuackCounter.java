public class QuackCounter implements Quacking {
    Observed observed;
    Quacking duck;
    static int quackCount = 0;

    public QuackCounter(Quacking duck) {
        this.duck = duck;
        this.observed = new Observed(this);
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
        noticeObservers();
    }

    public static int getQuackCount() {
        return quackCount;
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
