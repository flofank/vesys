package ch.fhnw.bank.communication;

import java.io.IOException;

import ch.fhnw.bank.Bank;

public class IsActiveTask extends Task {
	private static final long serialVersionUID = -1731763077009485668L;
	private String number;
	private boolean active;
	
	public IsActiveTask(String number) {
		this.number = number;
	}

	public void execute(Bank bank) {
		try {
			active = bank.getAccount(number).isActive();
		} catch (IOException e) {
			exception = e;
		}
	}
	
	public boolean getResult() {
		return active;
	}
}
