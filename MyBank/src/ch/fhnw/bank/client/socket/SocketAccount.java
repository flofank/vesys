package ch.fhnw.bank.client.socket;

import java.io.IOException;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;

public class SocketAccount implements Account {
	private String number;
	private SocketDriver driver;

	public SocketAccount(String number, SocketDriver driver) throws IOException {
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
			return driver.invoke("getAccountOwner," + number)[1];
		} catch (IllegalArgumentException | NoSuchMethodException
				| OverdrawException | InactiveException e) {
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public boolean isActive() throws IOException {
		try {
			return Boolean.parseBoolean(driver.invoke("getAccountStatus," + number)[1]);
		} catch (IllegalArgumentException | NoSuchMethodException
				| OverdrawException | InactiveException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void deposit(double amount) throws IOException,
			IllegalArgumentException, InactiveException {
		try {
			driver.invoke("depositOnAccount," + number + "," + amount);
		} catch (NoSuchMethodException | OverdrawException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void withdraw(double amount) throws IOException,
			IllegalArgumentException, OverdrawException, InactiveException {
		try {
			driver.invoke("withdrawFromAccount," + number + "," + amount);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	@Override
	public double getBalance() throws IOException {
		try {
			return Double.parseDouble(driver.invoke("getAccountBalance," + number)[1]);
		} catch (IllegalArgumentException | NoSuchMethodException
				| OverdrawException | InactiveException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
