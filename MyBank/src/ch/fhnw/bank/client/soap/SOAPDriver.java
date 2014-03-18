package ch.fhnw.bank.client.soap;

import java.io.IOException;
import ch.fhnw.bank.Bank;
import ch.fhnw.bank.BankDriver;
import ch.fhnw.bank.client.soap.jaxws.SOAPBankService;
import ch.fhnw.bank.client.soap.jaxws.SOAPBankServiceService;

public class SOAPDriver implements BankDriver {
	private SOAPBankService bankService;
	private SOAPBank bank;
	private String targetUrl;

	@Override
	public void connect(String[] args) throws IOException {
		SOAPBankServiceService service = new SOAPBankServiceService();
		bankService = service.getSOAPBankServicePort();
		bank = new SOAPBank(bankService);
		System.out.println("[INFO]Client started with server address: "
				+ targetUrl);
	}

	@Override
	public void disconnect() throws IOException {
		bank = null;
		System.out.println("[INFO]shutting down");
	}

	@Override
	public Bank getBank() {
		return bank;
	}

}
