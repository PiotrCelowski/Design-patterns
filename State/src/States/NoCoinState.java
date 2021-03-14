package States;

import Machine.BubbleGumMachine;

public class NoCoinState implements State {
    BubbleGumMachine bubbleGumMachine;

    public NoCoinState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin was inserted.");
        System.out.println("Switching to CoinInsertedState");
        bubbleGumMachine.set(bubbleGumMachine.getCoinInsertedState());
    }

    @Override
    public void returnCoin() {
        System.out.println("You didn't insert any coin!");
    }

    @Override
    public void turnTheSwitch() {
        System.out.println("You can't turn the switch without inserting the coin. Actually you can, but you won't get any gum.");
    }

    @Override
    public void returnGum() {
        System.out.println("Gum is not returned in this state.");
    }
}
