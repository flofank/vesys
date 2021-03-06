package ch.fhnw.bank.communication;

import java.io.IOException;
import java.util.HashSet;

import ch.fhnw.bank.Bank;

public class GetAccountNumbersTask extends Task {
	private static final long serialVersionUID = -4789828652392911917L;
	private HashSet<String> numbers;
	
	public void execute(Bank bank) {
		try {
			numbers = new HashSet<>(bank.getAccountNumbers());
		} catch (IOException e) {
			exception = e;
		}
	}
	
	public HashSet<String> getResult() {
		return numbers;
	}
}
