package States;

import Machine.BubbleGumMachine;

public class NoGumsState implements State {
    transient BubbleGumMachine bubbleGumMachine;

    public NoGumsState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Sorry, we are out of gums. Please get back your coin.");
    }

    @Override
    public void returnCoin() {
        System.out.println("You can take your coin back, we are out of gums.");
    }

    @Override
    public void turnTheSwitch() {
        System.out.println("You are turning the switch but nothing happens.");
    }

    @Override
    public void returnGum() {
        System.out.println("Gum is not returned in this state.");
    }
}
