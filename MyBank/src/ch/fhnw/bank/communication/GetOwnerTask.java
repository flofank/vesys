package ch.fhnw.bank.communication;

import java.io.IOException;

import ch.fhnw.bank.Bank;

public class GetOwnerTask extends Task {
	private static final long serialVersionUID = -7594440622975911176L;
	private String number;
	private String owner;
	
	public GetOwnerTask(String number) {
		this.number = number;
	}

	public void execute(Bank bank) {
		try {
			owner = bank.getAccount(number).getOwner();
		} catch (IOException e) {
			exception = e;
		}
	}
	
	public String getResult() {
		return owner;
	}
}
