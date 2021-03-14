import java.util.ArrayList;
import java.util.Iterator;

public class Observed implements QuackObserved {
    ArrayList observers = new ArrayList();
    QuackObserved duck;

    public Observed(QuackObserved duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(DuckObserver observer) {
        observers.add(observer);
    }

    @Override
    public void noticeObservers() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()) {
            DuckObserver observer = (DuckObserver) iterator.next();
            observer.update(duck);
        }
    }
}
