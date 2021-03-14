package States;

import Machine.BubbleGumMachine;

public class WinningState implements State {
    BubbleGumMachine bubbleGumMachine;

    public WinningState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You can't insert coin in this state.");
    }

    @Override
    public void returnCoin() {
        System.out.println("You can't return coin in this state.");
    }

    @Override
    public void turnTheSwitch() {
        System.out.println("You can't turn the switch in this state.");
    }

    @Override
    public void returnGum() {
        System.out.println("YOU WON! YOU WILL GET ANOTHER BUBBLE GUM FOR FREE!");
        bubbleGumMachine.returnGum();
        bubbleGumMachine.returnGum();
        if(bubbleGumMachine.getGumsAmount() == 0) {
            bubbleGumMachine.set(bubbleGumMachine.getNoGumsState());
        } else {
            if (bubbleGumMachine.getGumsAmount() > 0) {
                bubbleGumMachine.set(bubbleGumMachine.getNoCoinState());
            } else {
                System.out.println("No gums left in the machine, sorry");
                bubbleGumMachine.set(bubbleGumMachine.getNoGumsState());
            }
        }
    }
}
