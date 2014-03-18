package ch.fhnw.bank.client.soap;

import java.io.IOException;

import ch.fhnw.bank.Account;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;
import ch.fhnw.bank.client.soap.jaxws.IOException_Exception;
import ch.fhnw.bank.client.soap.jaxws.InactiveException_Exception;
import ch.fhnw.bank.client.soap.jaxws.OverdrawException_Exception;
import ch.fhnw.bank.client.soap.jaxws.SOAPBankService;
import ch.fhnw.bank.communication.DepositTask;
import ch.fhnw.bank.communication.GetBalanceTask;
import ch.fhnw.bank.communication.GetOwnerTask;
import ch.fhnw.bank.communication.IsActiveTask;
import ch.fhnw.bank.communication.WithdrawTask;

public class SOAPAccount implements Account {
	private String number;
	private SOAPBankService service;

	public SOAPAccount(String number, SOAPBankService service) throws IOException {
		this.number = number;
		this.service = service;
	}
	@Override
	public String getNumber() throws IOException {
		return number;
	}

	@Override
	public String getOwner() throws IOException {
		try {
			return service.getAccountOwner(number);
		} catch (IOException_Exception e) {
			throw new IOException(e);
		}
	}

	@Override
	public boolean isActive() throws IOException {
		try {
			return service.isAccountActive(number);
		} catch (IOException_Exception e) {
			throw new IOException(e);
		}
	}

	@Override
	public void deposit(double amount) throws IOException,
			IllegalArgumentException, InactiveException {
		try {
			service.deposit(number, amount);
		} catch (IOException_Exception e) {
			throw new IOException(e);
		} catch (InactiveException_Exception e) {
			throw new InactiveException(e);
		}
	}

	@Override
	public void withdraw(double amount) throws IOException,
			IllegalArgumentException, OverdrawException, InactiveException {
		try {
			service.withdraw(number, amount);
		} catch (IOException_Exception e) {
			throw new IOException(e);
		} catch (InactiveException_Exception e) {
			throw new InactiveException(e);
		} catch (OverdrawException_Exception e) {
			throw new OverdrawException(e);
		}
	}

	@Override
	public double getBalance() throws IOException {
		try {
			return service.getAccountBalance(number);
		} catch (IOException_Exception e) {
			throw new IOException(e);
		}
	}
}
