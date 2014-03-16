package ch.fhnw.bank.communication;

import java.io.IOException;

import ch.fhnw.bank.Bank;

public class CloseAccountTask extends Task {
	private static final long serialVersionUID = -7296963250770451539L;
	private String number;
	private boolean confirm;
	
	public CloseAccountTask(String number) {
		this.number = number;
	}

	public void execute(Bank bank) {
		try {
			bank.closeAccount(number);
		} catch (IOException e) {
			exception = e;
		}
	}
	
	public boolean getResult() {
		return confirm;
	}
}
