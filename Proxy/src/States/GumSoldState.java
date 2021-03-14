package States;

import Machine.BubbleGumMachine;

public class GumSoldState implements State {
    transient BubbleGumMachine bubbleGumMachine;

    public GumSoldState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Wait for your bubble gum! You can enter another coin later.");
    }

    @Override
    public void returnCoin() {
        System.out.println("You can't get your coin back now. Wait for your bubble gum!");
    }

    @Override
    public void turnTheSwitch() {
        System.out.println("Wait for your bubble gum! You won't get another one for one coin.");
    }

    @Override
    public void returnGum() {
        System.out.println("Here is your bubble gum.");
        bubbleGumMachine.returnGum();
        if(bubbleGumMachine.getGumsAmount() > 0) {
            bubbleGumMachine.set(bubbleGumMachine.getNoCoinState());
        } else {
            System.out.println("No gums left in the machine, sorry");
            bubbleGumMachine.set(bubbleGumMachine.getNoGumsState());
        }
    }
}
