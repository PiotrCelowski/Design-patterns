import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList menu;

    public PancakeHouseMenu() {
        this.menu = new ArrayList();

        addMenuPosition("Cheese pancake", true, 20.00);
        addMenuPosition("Fruit pancake", true, 25.00);
        addMenuPosition("Meat pancake", false, 30.00);
    }

    public void addMenuPosition(String name, boolean vegetarian, double price) {
        MenuPosition position = new MenuPosition(name, vegetarian, price);
        menu.add(position);
    }

    public Iterator getIterator() {
        return menu.iterator();
    }
}
