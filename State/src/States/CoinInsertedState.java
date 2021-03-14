package States;

import Machine.BubbleGumMachine;

import java.util.Random;

public class CoinInsertedState implements State {
    Random randomWin = new Random(System.currentTimeMillis());
    BubbleGumMachine bubbleGumMachine;

    public CoinInsertedState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You can't insert two coins.");
    }

    @Override
    public void returnCoin() {
        System.out.println("Coin is being return. Pick it up.");
        bubbleGumMachine.set(bubbleGumMachine.getNoCoinState());
    }

    @Override
    public void turnTheSwitch() {
        System.out.println("You turned the switch.");
        int win = randomWin.nextInt(10);
        if(win == 0) {
            bubbleGumMachine.set(bubbleGumMachine.getWinningState());
            bubbleGumMachine.getWinningState().returnGum();
        } else {
            bubbleGumMachine.set(bubbleGumMachine.getGumSoldState());
            bubbleGumMachine.getGumSoldState().returnGum();
        }
    }

    @Override
    public void returnGum() {
        System.out.println("Gum is not returned in this state.");
    }
}
