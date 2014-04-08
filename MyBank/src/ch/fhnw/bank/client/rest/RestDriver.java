package ch.fhnw.bank.client.rest;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import ch.fhnw.bank.Bank;
import ch.fhnw.bank.BankDriver;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;

public class RestDriver implements BankDriver{
	private Client client;
	private String rootUrl;
	private Bank bank;
	
	@Override
	public void connect(String[] args) throws IOException {
		client = ClientBuilder.newClient();
		bank = new RestBank(this);
		rootUrl = args[0];
	}

	@Override
	public void disconnect() throws IOException {
		// Do nothing
	}

	@Override
	public Bank getBank() {
		return bank;
	}
	
	public String doGet(String path) throws OverdrawException, InactiveException {
		Response resp = client.target(rootUrl + path).request().get();
		return handleResponse(resp);
	}

	public String doPost(String path) throws OverdrawException, InactiveException {
		Response resp = client.target(rootUrl + path).request().post(null);
		return handleResponse(resp);
	}
	
	public String doDelete(String path) throws OverdrawException, InactiveException {
		Response resp = client.target(rootUrl + path).request().delete();
		return handleResponse(resp);
	}

	public String handleResponse(Response resp) throws OverdrawException, InactiveException {
		switch (resp.getStatus()) {
		case 400:
			throw new IllegalArgumentException(); // Bad Request
		case 403:
			throw new OverdrawException(); // Forbidden
		case 410:
			throw new InactiveException(); // Gone
		default:
			return resp.readEntity(String.class);
		}
	}
	

}
