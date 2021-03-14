import Machine.BubbleGumMachine;
import Machine.RemoteBubbleGumMachine;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MonitorTest {
    public static void main(String[] args) {
        String[] locations = {"rmi://192.168.1.11/krakow"};

        BubbleGumMachineMonitor[] monitor = new BubbleGumMachineMonitor[locations.length];

        for(int i=0; i<locations.length; i++) {
            try {
                RemoteBubbleGumMachine remoteBubbleGumMachine = (RemoteBubbleGumMachine) Naming.lookup(locations[i]);
                monitor[i] = new BubbleGumMachineMonitor(remoteBubbleGumMachine);
                System.out.println(monitor[i]);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        for(int i=0; i<monitor.length; i++) {
            monitor[i].report();
        }
    }
}
