import java.util.Iterator;

public class EmptyIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return false;
    }
}
