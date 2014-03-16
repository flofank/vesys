package ch.fhnw.bank.communication;

import java.io.IOException;
import java.util.Set;

import ch.fhnw.bank.Bank;

public class GetAccountNumbersTask extends Task {
	private static final long serialVersionUID = -4789828652392911917L;
	private Set<String> numbers;
	
	public void execute(Bank bank) {
		try {
			numbers = bank.getAccountNumbers();
		} catch (IOException e) {
			exception = e;
		}
	}
	
	public Set<String> getResult() {
		return numbers;
	}
}
