package ch.fhnw.bank.local;

import java.io.IOException;

import ch.fhnw.bank.Bank;
import ch.fhnw.bank.BankDriver;

public class LocalDriver implements BankDriver {
	private Bank bank;
	
	@Override
	public void connect(String[] args) throws IOException {
		bank = new LocalBank();
		System.out.println("...connected");
	}

	@Override
	public void disconnect() throws IOException {
		bank = null;
		System.out.println("...disconnected");
	}

	@Override
	public Bank getBank() {
		return bank;
	}

}
