package bank.sockets;

import java.io.IOException;

import bank.Bank;
import bank.BankDriver;

public class SocketDriver implements BankDriver {
	private Bank bank;
	
	@Override
	public void connect(String[] args) throws IOException {
		bank = new SocketBank();
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
