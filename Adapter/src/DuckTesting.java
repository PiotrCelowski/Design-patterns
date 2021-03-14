public class DuckTesting {
    public static void main(String[] args) {
        WildDuck duck = new WildDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Duck sounds like: ");
        testDuck(duck);

        System.out.println("TurkeyAdapter sounds like: ");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
