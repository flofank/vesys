package bank.server;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import bank.Account;
import bank.Bank;
import bank.InactiveException;
import bank.OverdrawException;


public class ServerBank implements Bank{
	private Map<String, Account> accounts = new HashMap<String, Account>();
	private Map<String, Account> inactiveAccounts = new HashMap<String, Account>();
	private static ServerBank INSTANCE;
	
	private ServerBank() {
		//Singleton
		System.out.println("Bank initialised");
	}
	
	public static ServerBank getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ServerBank();
		}
		return INSTANCE;
	}
	
	@Override
	public String createAccount(String owner) throws IOException {
		Account ac = new ServerAccount(owner);
		accounts.put(ac.getNumber(), ac);
		return ac.getNumber();
	}

	@Override
	public boolean closeAccount(String number) throws IOException {
		Account ac = getAccount(number);
		if (((ServerAccount) ac).close()) {
			accounts.remove(number);
			inactiveAccounts.put(number, ac);
			return true;
		}
		return false;
	}

	@Override
	public Set<String> getAccountNumbers() throws IOException {
		return accounts.keySet();
	}

	@Override
	public Account getAccount(String number) throws IOException {
		if (accounts.containsKey(number)) {
			return accounts.get(number);
		} else {
			return inactiveAccounts.get(number);
		}
		
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
