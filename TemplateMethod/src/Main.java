public class Main {
    public static void main(String[] args) {
        CaffeineDrink coffee = new Coffee();
        CaffeineDrink tea = new Tea();

        System.out.println("\nPrepare tea.");
        tea.recipe();

        System.out.println("\nPrepare coffe.");
        coffee.recipe();
    }
}
