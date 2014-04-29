package ch.fhnw.bank.server.rmi;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Set;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;
import ch.fhnw.bank.server.ServerBank;

public class RMIBank extends UnicastRemoteObject implements BankInterface {
	private ServerBank bank;

	protected RMIBank() throws RemoteException {
		super();
		bank = ServerBank.getInstance();
	}

	
	@Override
	public String createAccount(String owner) throws IOException {
		return bank.createAccount(owner);
	}

	@Override
	public boolean closeAccount(String number) throws IOException {
		return bank.closeAccount(number);
	}

	@Override
	public Set<String> getAccountNumbers() throws IOException {
		return new HashSet<String>(bank.getAccountNumbers());
	}

	@Override
	public RMIAccount getAccount(String number) throws IOException {
		return new RMIAccount(bank.getAccount(number));
	}

	@Override
	public void transfer(Account a, Account b, double amount)
			throws IOException, IllegalArgumentException, OverdrawException,
			InactiveException {
		bank.transfer(a, b, amount);
	}

}
