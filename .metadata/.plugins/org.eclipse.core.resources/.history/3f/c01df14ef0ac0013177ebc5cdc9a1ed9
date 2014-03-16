package ch.fhnw.bank.client.servlet;

import java.io.IOException;
import java.util.Set;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.Bank;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;
import ch.fhnw.bank.communication.CloseAccountTask;
import ch.fhnw.bank.communication.CreateAccountTask;
import ch.fhnw.bank.communication.GetAccountNumbersTask;
import ch.fhnw.bank.communication.TransferTask;

public class ServletBank implements Bank {
	private ServletDriver driver;

	public ServletBank(ServletDriver driver) {
		this.driver = driver;
	}

	@Override
	public String createAccount(String owner) throws IOException {
		CreateAccountTask task = new CreateAccountTask(owner);
		task = driver.invoke(task);
		return task.getResult();
	}

	@Override
	public boolean closeAccount(String number) throws IOException {
		CloseAccountTask task = new CloseAccountTask(number);
		task = driver.invoke(task);
		return task.getResult();
	}

	@Override
	public Set<String> getAccountNumbers() throws IOException {
		GetAccountNumbersTask task = new GetAccountNumbersTask();
		task = driver.invoke(task);
		return task.getResult();
	}

	@Override
	public Account getAccount(String number) throws IOException {
		return new ServletAccount(number, driver);
	}

	@Override
	public void transfer(Account a, Account b, double amount)
			throws IOException, IllegalArgumentException, OverdrawException,
			InactiveException {
		TransferTask task = new TransferTask(a.getNumber(), b.getNumber(), amount);
		task = driver.invoke(task);
		task.getResult();
	}

}
