package ch.fhnw.bank.server.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		try {
			LocateRegistry.createRegistry(1099);
		} catch (RemoteException e) {
			System.out.println("Creating registry failed");
		}
		BankInterface rmibank = new RMIBank();
		Naming.rebind("BankService", rmibank);
	}
}
