import Machine.BubbleGumMachine;
import Machine.RemoteBubbleGumMachine;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
To run type in terminal:
1. javac Main.java -> to compile
2. java Main krakow 100 -> to run
 */
public class CreateRemoteMachine {
    public static void main(String[] args) {
        int number = 0;

        if(args.length < 2) {
            System.out.println("BubbleGumMachine <location> <gums>");
            System.exit(1);
        }

        try {
            number = Integer.parseInt(args[1]);
            RemoteBubbleGumMachine remotebubbleGumMachine = new BubbleGumMachine(args[0], number);
            Naming.bind("//192.168.1.11/" + args[0], remotebubbleGumMachine);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
