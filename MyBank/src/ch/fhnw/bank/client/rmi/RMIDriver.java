package ch.fhnw.bank.client.rmi;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;

import ch.fhnw.bank.Bank;
import ch.fhnw.bank.BankDriver;

public class RMIDriver implements BankDriver{
	private Bank bank;

	@Override
	public void connect(String[] args) throws IOException {
		try {
			LocateRegistry.createRegistry(1099);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bank = (Bank) Naming.lookup("BankService");
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void disconnect() throws IOException {
		bank = null;		
	}

	@Override
	public Bank getBank() {
		return bank;
	}

}
