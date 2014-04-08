package ch.fhnw.bank.client.rest;

import java.io.IOException;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;

public class RestAccount implements Account{
	private String number;
	private RestDriver driver;
	
	public RestAccount(String number, RestDriver driver) {
		this.number = number;
		this.driver = driver;
	}

	@Override
	public String getNumber() throws IOException {
		return number;
	}

	@Override
	public String getOwner() throws IOException {
		try {
			return driver.doGet("account/" + number + "/owner");
		} catch (OverdrawException | InactiveException e) {
			// Won't happen
			throw new IOException(e);
		}
	}

	@Override
	public double getBalance() throws IOException {
		try {
			return Double.parseDouble(driver.doGet("account/" + number + "/balance"));
		} catch (OverdrawException | InactiveException e) {
			// Won't happen
			throw new IOException(e);
		}
	}
	
	@Override
	public boolean isActive() throws IOException {
		try {
			return Boolean.parseBoolean(driver.doGet("account/" + number + "/active"));
		} catch (OverdrawException | InactiveException e) {
			// Won't happen
			throw new IOException(e);
		}
	}

	@Override
	public void deposit(double amount) throws IOException, IllegalArgumentException, InactiveException {
		try {
			driver.doPost("bank/transactions/" + number + "/" + amount);
		} catch (OverdrawException e) {
			// Won't happen
			throw new IOException(e);
		}
	}

	@Override
	public void withdraw(double amount) throws IOException, IllegalArgumentException, OverdrawException,
			InactiveException {
		driver.doGet("bank/transactions/" + number + "/" + amount);
	}
}
