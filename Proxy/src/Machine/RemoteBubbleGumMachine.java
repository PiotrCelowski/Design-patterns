package Machine;

import States.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteBubbleGumMachine extends Remote {
    int getGumsAmount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
