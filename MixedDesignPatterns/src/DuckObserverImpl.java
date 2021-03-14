public class DuckObserverImpl implements DuckObserver {
    @Override
    public void update(QuackObserved duck) {
        System.out.println("Duck quacked!");
    }
}
