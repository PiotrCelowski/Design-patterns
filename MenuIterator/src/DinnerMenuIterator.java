import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    MenuPosition[] menu;
    int position = 0;

    public DinnerMenuIterator(MenuPosition[] menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        if(position >= menu.length || menu[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuPosition menuPosition = menu[position];
        position++;
        return menuPosition;
    }
}
