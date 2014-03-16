package ch.fhnw.bank.communication;

import java.io.IOException;

import ch.fhnw.bank.Bank;

public class CreateAccountTask extends Task {
	private static final long serialVersionUID = 6619581914510342164L;
	private String owner;
	private String number;
	
	public CreateAccountTask(String owner) {
		this.owner = owner;
	}

	public void execute(Bank bank) {
		try {
			number = bank.createAccount(owner);
		} catch (IOException e) {
			exception = e;
		}
	}
	
	public String getResult() {
		return number;
	}
}
