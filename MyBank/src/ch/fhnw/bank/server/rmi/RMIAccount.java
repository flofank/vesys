package ch.fhnw.bank.server.rmi;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;

public class RMIAccount extends UnicastRemoteObject implements AccountInterface {
	private Account account;

	protected RMIAccount(Account account) throws RemoteException {
		super();
		this.account = account;
	}

	@Override
	public String getNumber() throws IOException {
		return account.getNumber();
	}

	@Override
	public String getOwner() throws IOException {
		return account.getOwner();
	}

	@Override
	public boolean isActive() throws IOException {
		return account.isActive();
	}

	@Override
	public void deposit(double amount) throws IOException,
			IllegalArgumentException, InactiveException {
		account.deposit(amount);
	}

	@Override
	public void withdraw(double amount) throws IOException,
			IllegalArgumentException, OverdrawException, InactiveException {
		account.withdraw(amount);
	}

	@Override
	public double getBalance() throws IOException {
		return account.getBalance();
	}
}
