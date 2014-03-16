package ch.fhnw.bank.communication;

import java.io.IOException;

import ch.fhnw.bank.Bank;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;

public class WithdrawTask extends Task {
	private static final long serialVersionUID = 3792722161153177050L;
	private String number;
	private double amount;
	
	public WithdrawTask(String number, double amount) {
		// TODO Auto-generated constructor stub
	}

	public void execute(Bank bank) {
		try {
			bank.getAccount(number).withdraw(amount);
		} catch (IllegalArgumentException | IOException | OverdrawException
				| InactiveException e) {
			exception = e;
		}
	}
	
	public Object getResult() throws OverdrawException {
		return null;
	}
}
