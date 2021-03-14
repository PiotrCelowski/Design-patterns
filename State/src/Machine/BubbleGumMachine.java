package Machine;

import States.*;

public class BubbleGumMachine {
    State noCoinState;
    State coinInsertedState;
    State gumSoldState;
    State noGumsState;
    State winningState;


    State state = noGumsState;
    int gumsAmount = 0;

    public BubbleGumMachine(int gumsAmount) {
        this.noCoinState = new NoCoinState(this);
        this.coinInsertedState = new CoinInsertedState(this);
        this.gumSoldState = new GumSoldState(this);
        this.noGumsState = new NoGumsState(this);
        this.winningState = new WinningState(this);

        this.gumsAmount = gumsAmount;
        if(this.gumsAmount > 0) {
            state = noCoinState;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void turnTheSwitch() {
        state.turnTheSwitch();
    }

    public void set(State state) {
        this.state = state;
    }

    public void returnGum() {
        System.out.println("Gum.");
        if(gumsAmount != 0) {
            gumsAmount--;
        }
        System.out.println("Number of gums left in machine: " + gumsAmount);
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getCoinInsertedState() {
        return coinInsertedState;
    }

    public State getGumSoldState() {
        return gumSoldState;
    }

    public State getNoGumsState() {
        return noGumsState;
    }

    public State getState() {
        return state;
    }

    public int getGumsAmount() {
        return gumsAmount;
    }

    public State getWinningState() {
        return winningState;
    }
}
