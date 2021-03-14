package Machine;

import States.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BubbleGumMachine extends UnicastRemoteObject implements RemoteBubbleGumMachine {
    State noCoinState;
    State coinInsertedState;
    State gumSoldState;
    State noGumsState;
    State winningState;
    String location;


    State state = noGumsState;
    int gumsAmount = 0;

    public BubbleGumMachine(String location, int gumsAmount) throws RemoteException {
        this.noCoinState = new NoCoinState(this);
        this.coinInsertedState = new CoinInsertedState(this);
        this.gumSoldState = new GumSoldState(this);
        this.noGumsState = new NoGumsState(this);
        this.winningState = new WinningState(this);
        this.location = location;

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

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public int getGumsAmount() {
        return gumsAmount;
    }

    public State getWinningState() {
        return winningState;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
