public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("Pancake menu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner menu", "Dinner");
        MenuComponent krakus = new Menu("Krakus", "Lunch");
        MenuComponent dessert = new Menu("Desser menu", "Dessert");

        MenuComponent allMenu = new Menu("All menu", "Connected menu");

        pancakeMenu.add(new MenuPosition("Cheese pancake", true, 20.00));
        pancakeMenu.add(new MenuPosition("Fruit pancake", true, 25.00));
        pancakeMenu.add(new MenuPosition("Meat pancake", false, 30.00));

        dinnerMenu.add(new MenuPosition("Sandwich", false, 15.00));
        dinnerMenu.add(new MenuPosition("Hot-dog", false, 20.00));
        dinnerMenu.add(new MenuPosition("VegeBurger", true, 33.99));

        dessert.add(new MenuPosition("Ice cream", true, 5.00));
        dessert.add(new MenuPosition("Cake", true, 25.00));

        krakus.add(new MenuPosition("Spaghetti", false, 10.00));
        krakus.add(new MenuPosition("Tomato soup", false, 9.00));

        //add sub menu
        krakus.add(dessert);

        //add menu to all menu
        allMenu.add(pancakeMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(krakus);

        Waitress waitress = new Waitress(allMenu);
        waitress.printAllVegeDishes();

    }
}
