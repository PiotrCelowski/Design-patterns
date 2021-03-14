public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Krakus krakusMenu = new Krakus();

        Waitress waitress = new Waitress(pancakeMenu, dinnerMenu, krakusMenu);
        waitress.printMenu();
    }
}
