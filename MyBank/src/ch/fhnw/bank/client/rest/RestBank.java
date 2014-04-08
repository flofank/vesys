package ch.fhnw.bank.client.rest;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.google.gson.Gson;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.Bank;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;

public class RestBank implements Bank{
	private RestDriver driver;
	
	public RestBank(RestDriver driver) {
		this.driver = driver;
	}

	@Override
	public String createAccount(String owner) throws IOException {
		try {
			return driver.doPost("bank/accounts/" + owner);
		} catch (OverdrawException | InactiveException e) {
			// Won't happen
			throw new IOException(e);
		}
	}

	@Override
	public boolean closeAccount(String number) throws IOException {
		try {
			driver.doDelete("bank/accounts/" + number);
			return true;
		} catch (InactiveException e) {
			return false;
		} catch (OverdrawException e) {
			// Won't happen
			throw new IOException(e);
		}
	}

	@Override
	public Set<String> getAccountNumbers() throws IOException {
		try {
			String numbers = driver.doGet("bank/accounts");
			if (numbers.length() > 0) {
				return new HashSet<String>(Arrays.asList(numbers.split(",")));
			}
			return new TreeSet<String>();
		} catch (OverdrawException | InactiveException e) {
			// Won't happen
			throw new IOException(e);
		}
	}

	@Override
	public Account getAccount(String number) throws IOException {
		return new RestAccount(number, driver);
	}

	@Override
	public void transfer(Account a, Account b, double amount) throws IOException, IllegalArgumentException,
			OverdrawException, InactiveException {
		driver.doPost("bank/transactions/" + a.getNumber() + "/" + b.getNumber() + "/" + amount);
	}

}
