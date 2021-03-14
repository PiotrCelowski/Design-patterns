import java.awt.*;
import java.util.Iterator;

public class Waitress {
    PancakeHouseMenu pancakeMenu;
    DinnerMenu dinnerMenu;
    Krakus krakusMenu;

    public Waitress(PancakeHouseMenu pancakeMenu, DinnerMenu dinnerMenu, Krakus krakusMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinnerMenu = dinnerMenu;
        this.krakusMenu = krakusMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeMenu.getIterator();
        Iterator dinnerIterator = dinnerMenu.getIterator();
        Iterator krakusIterator = krakusMenu.getIterator();

        System.out.println("\nPancakes menu: ");
        printMenu(pancakeIterator);
        System.out.println("\nDinner menu");
        printMenu(dinnerIterator);
        System.out.println("\nKrakus menu");
        printMenu(krakusIterator);
    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuPosition position = (MenuPosition) iterator.next();
            System.out.println("Following food: " + position.getName() + " cost " + position.getPrice());
        }
    }
}
