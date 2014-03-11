package ch.fhnw.bank.client.socket;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.Bank;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;

public class SocketBank implements Bank {
	private SocketDriver driver;

	public SocketBank(SocketDriver driver) {
		this.driver = driver;
	}

	@Override
	public String createAccount(String owner) throws IOException {
		try {
			return driver.invoke("createAccount," + owner)[1];
		} catch (IllegalArgumentException | OverdrawException
				| InactiveException | NoSuchMethodException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
			return "";
		}
	}

	@Override
	public boolean closeAccount(String number) throws IOException {
		try {
			return Boolean.parseBoolean(driver.invoke("closeAccount," + number)[1]);
		} catch (IllegalArgumentException | OverdrawException
				| InactiveException | NoSuchMethodException e) {
			return false;
		}
	}

	@Override
	public Set<String> getAccountNumbers() throws IOException {
		Set<String> numbers = new TreeSet<String>();
		try {
			String[] results = driver.invoke("getAccountNumbers");
			for (int i = 1; i < results.length; i++) {
				numbers.add(results[i]);
			}
		} catch (IllegalArgumentException | OverdrawException
				| InactiveException | NoSuchMethodException e) {
			e.printStackTrace();
		}
		return numbers;
	}

	@Override
	public Account getAccount(String number) throws IOException {
		return new SocketAccount(number, driver);
	}

	@Override
	public void transfer(Account a, Account b, double amount)
			throws IOException, IllegalArgumentException, OverdrawException,
			InactiveException {
		if (amount < 0) {
			throw new IllegalArgumentException("No negative amounts allowed");
		}
		a.withdraw(amount);
		b.deposit(amount);
	}

}
