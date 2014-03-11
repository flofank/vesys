package ch.fhnw.bank.communication;

import java.util.Set;

public class GetAccountNumbersTask extends Task {
	private Set<String> numbers;
	
	public void execute() {
		
	}
	
	public Set<String> getResult() {
		return numbers;
	}
}
