import java.util.ArrayList;
import java.util.Iterator;

public class DucksHerd implements Quacking {
    Observed observed;
    ArrayList birds = new ArrayList();

    public void add(Quacking bird) {
        birds.add(bird);
        this.observed = new Observed(this);
    }

    @Override
    public void quack() {
        Iterator iterator = birds.iterator();
        while(iterator.hasNext()) {
            Quacking bird = (Quacking) iterator.next();
            bird.quack();
        }
    }

    @Override
    public void registerObserver(DuckObserver observer) {
        Iterator iterator = birds.iterator();
        while(iterator.hasNext()) {
            Quacking bird = (Quacking) iterator.next();
            bird.registerObserver(observer);
        }
    }

    @Override
    public void noticeObservers() {
        observed.noticeObservers();
    }
}
