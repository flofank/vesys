package ch.fhnw.bank.communication;

import java.io.IOException;

import ch.fhnw.bank.Bank;
import ch.fhnw.bank.InactiveException;

public class DepositTask extends Task {
	private static final long serialVersionUID = -8120318108314014841L;
	public String number;
	public Double amount;
	
	public DepositTask(String number, double amount) {
		this.number = number;
		this.amount = amount;
	}

	public void execute(Bank bank) {
		try {
			bank.getAccount(number).deposit(amount);
		} catch (IllegalArgumentException | IOException | InactiveException e) {
			exception = e;
		}
	}
	
	public Object getResult() {
		return null;
	}
}
