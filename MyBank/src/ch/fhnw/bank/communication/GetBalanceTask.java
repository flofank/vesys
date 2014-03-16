package ch.fhnw.bank.communication;

import java.io.IOException;

import ch.fhnw.bank.Bank;

public class GetBalanceTask extends Task {
	private static final long serialVersionUID = -847387053215748556L;
	private String number;
	private double amount;
	
	public GetBalanceTask(String number) {
		this.number = number;
	}

	public void execute(Bank bank) {
		try {
			amount = bank.getAccount(number).getBalance();
		} catch (IOException e) {
			exception = e;
		}
	}
	
	public double getResult() {
		return amount;
	}
}
