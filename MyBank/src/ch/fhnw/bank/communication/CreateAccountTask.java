package ch.fhnw.bank.communication;

public class CreateAccountTask extends Task {
	private String owner;
	private String number;
	
	public CreateAccountTask(String owner) {
		this.owner = owner;
	}

	public void execute() {
		
	}
	
	public String getResult() {
		return owner;
	}
}
