import java.util.Iterator;

public class MenuPosition extends MenuComponent {
    String name;
    boolean vegetarian;
    double price;

    public MenuPosition(String name, boolean vegetarian, double price) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(getName());
        if (isVegetarian()) {
            System.out.println("Vege");
        }
        System.out.println(getPrice());
        System.out.println("*");
    }

    public Iterator getIterator() {
        return new EmptyIterator();
    }
}
