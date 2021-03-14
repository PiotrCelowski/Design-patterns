import Machine.BubbleGumMachine;
import Machine.RemoteBubbleGumMachine;

import java.rmi.RemoteException;

public class BubbleGumMachineMonitor {
    RemoteBubbleGumMachine remoteBubbleGumMachine;

    public BubbleGumMachineMonitor(RemoteBubbleGumMachine remote) {
        this.remoteBubbleGumMachine = remote;
    }

    public void report() {
        try {
            System.out.println("Bubble gum machine location: " + remoteBubbleGumMachine.getLocation());
            System.out.println("Bubble gums left: " + remoteBubbleGumMachine.getGumsAmount());
            System.out.println("State: " + remoteBubbleGumMachine.getState().getClass().getName());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
