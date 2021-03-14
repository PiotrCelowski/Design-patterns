public class Tea extends CaffeineDrink {
    @Override
    void breweing() {
        System.out.println("Brewing tea.");
    }

    @Override
    void addingExtras() {
        System.out.println("Add lemon and sugar.");
    }
}
