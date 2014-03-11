package ch.fhnw.bank.server;

import java.io.IOException;
import java.text.MessageFormat;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;

public class ServerAccount implements Account {
	private static final String NUMBER_PATTERN = "42-1337-{0}";
	private static int numberCounter = 0;
	private final String number;
	private final String owner;
	private boolean active;
	private double balance;
	
	public ServerAccount(String owner) {
		this.owner = owner;
		this.number = MessageFormat.format(NUMBER_PATTERN, ++numberCounter);
		active = true;
	}
	
	@Override
	public String getNumber() {
		return number;
	}

	@Override
	public String getOwner() {
		return owner;
	}

	@Override
	public boolean isActive() {
		return active;
	}

	@Override
	public void deposit(double amount) throws IOException,
			IllegalArgumentException, InactiveException {
		if (amount < 0) {
			throw new IllegalArgumentException("No negative values allowed");
		}
		if (!active) {
			throw new InactiveException("Account not active");
		}
		balance += amount;
		
	}

	@Override
	public void withdraw(double amount) throws IOException,
			IllegalArgumentException, OverdrawException, InactiveException {
		if (amount < 0) {
			throw new IllegalArgumentException("No negative values allowed");
		}
		if (!active) {
			throw new InactiveException("Account not active");
		}
		if (balance < amount) {
			throw new OverdrawException("Not enough money on account");
		}
		balance -= amount;
	}

	@Override
	public double getBalance() throws IOException {
		return balance;
	}
	
	protected boolean close() {
		if (balance == 0 && active) {
			active = false;
			return true;
		}
		return false;
	}

}
