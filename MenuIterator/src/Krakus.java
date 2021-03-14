import java.util.Hashtable;
import java.util.Iterator;

public class Krakus {
    Hashtable menu;

    public Krakus() {
        this.menu = new Hashtable();

        addMenuPosition("Spaghetti", false, 10.00);
        addMenuPosition("Tomato soup", false, 9.00);
    }

    public void addMenuPosition(String name, boolean vegetarian, double price) {
        MenuPosition position = new MenuPosition(name, vegetarian, price);
        menu.put(position.getName(), position);
    }

    public Iterator getIterator() {
        return menu.values().iterator();
    }
}
