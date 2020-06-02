package by.module4.task24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Bank {
	private ArrayList<Customer> customers;
	private ArrayList<Account> accounts;
	
	public Bank() {
		customers = new ArrayList<Customer>();
		accounts = new ArrayList<Account>();	
	}
	
	public ArrayList<Account> findAccounts(Customer customer) {
		ArrayList<Account> result = new ArrayList<Account>();
		Iterator iterator = this.accounts.iterator();
		Account next;
		
		while (iterator.hasNext()) {
			next = (Account) iterator.next();
			if (customer == null) {
				return null;
			}
			if (next.getOwner().equals(customer)) {
				result.add(next);
			} 
		} 
		return result;
	}
	
	public ArrayList<Account> findAccounts() {
		return accounts;
	}
	
	public ArrayList<Account> findAccountsSorted(Customer customer) {
		ArrayList<Account> result = new ArrayList<Account>();
		result = findAccounts(customer);
		Comparator <Account> comparator =  new Comparator<Account>() {
			public int compare (Account account1, Account account2) {
				return account1.compareTo(account2);
			}
		};
		Collections.sort(result, comparator);
		return result;
	}
	
	public void createAccount(Customer customer) {
		accounts.add(new Account(accounts.size(), customer));
	}
	
	public void createAccount(Customer customer, double account) {
		accounts.add(new Account(accounts.size(), customer, account));
	}
	
	public void createAccount(String id, double account) {
		if (!(findCustomer(id) == null)) {
			accounts.add(new Account(accounts.size(), findCustomer(id), account));
		}
	}
	
	public void transaction (Account account, double amount) {
		account.addTransaction(amount);
	}
	
	public void disableAccount(Account account) {
		account.setActive(false);
	} 
	
	public void enableAccount(Account account) {
		account.setActive(true);
	} 
	
	public Customer findCustomer(String id) {
		Customer result;
		Iterator iterator = this.customers.iterator();
		Customer next;
		result = null;
		while (iterator.hasNext()) {
			next = (Customer) iterator.next();
			if (id.isEmpty()) {
				return null;
			}
			if (next.getId().contentEquals(id)) {
				return next;
			} 
		} 
		return result;
	}
	
	public void addCustomer(String id, String name) {
		if (id.isEmpty()) {
			return;
		}
		if (findCustomer(id) == null) {
			customers.add(new Customer(id, name));
		}
	}
}
