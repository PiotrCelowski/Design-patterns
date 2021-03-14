import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineDrink {
    @Override
    void breweing() {
        System.out.println("Brewing coffee.");
    }

    @Override
    void addingExtras() {
        System.out.println("Adding sugar and milk.");
    }

    @Override
    public boolean wantsExtras() {
        String answer = getAnswer();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getAnswer() {
        String answer = null;
        System.out.println("Would you like any extras? Y/N");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            System.out.println("Input error: " + ex);
        }

        if (answer == null) {
            return "No";
        }
        return answer;
    }
}
