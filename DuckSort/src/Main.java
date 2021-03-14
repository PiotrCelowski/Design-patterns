import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Duck[] duckArray = {
                new Duck("Donald", 5),
                new Duck("Daffy", 8),
                new Duck("Howard", 7),
                new Duck("Dewey", 2)
        };

        System.out.println("\nShow ducks before sorting: ");
        showDucks(duckArray);

        Arrays.sort(duckArray);

        System.out.println("\nShow sorted ducks: ");
        showDucks(duckArray);
    }

    public static void showDucks(Duck[] ducks) {
        for(int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
