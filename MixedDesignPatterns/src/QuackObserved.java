import java.util.Observer;

public interface QuackObserved {
    void registerObserver(DuckObserver observer);
    void noticeObservers();
}
