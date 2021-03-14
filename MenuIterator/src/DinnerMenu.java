public class DinnerMenu {
    static final int MAX_ELEMENTS_COUNT = 6;
    int elementCount = 0;
    MenuPosition[] menuPositions;

    public DinnerMenu() {
        menuPositions = new MenuPosition[MAX_ELEMENTS_COUNT];

        addElement("Sandwich", false, 15.00);
        addElement("Hot-dog", false, 20.00);
        addElement("VegeBurger", true, 33.99);

    }

    public void addElement(String name, boolean vegetarian, double price) {
        MenuPosition position = new MenuPosition(name, vegetarian, price);
        if(elementCount==MAX_ELEMENTS_COUNT) {
            System.err.println("Menu is already full.");
        } else {
            menuPositions[elementCount] = position;
            elementCount++;
        }
    }

    public MenuPosition[] getMenu() {
        return menuPositions;
    }

    public DinnerMenuIterator getIterator() {
        return new DinnerMenuIterator(menuPositions);
    }
}
