import Machine.BubbleGumMachine;

public class Main {
    public static void main(String[] args) {
        BubbleGumMachine bubbleGumMachine = new BubbleGumMachine(10);

        for(int i=0; i <10; i++ ){
            System.out.println("\nInserting coin and turning the switch - happy path.");
            bubbleGumMachine.insertCoin();
            bubbleGumMachine.turnTheSwitch();
        }

    }
}
