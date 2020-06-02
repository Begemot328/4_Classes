package by.module4.task24pt2;

import by.module4.task24.Bank;
import by.module4.task24.Customer;

import java.util.ArrayList;
import java.util.Iterator;

import by.module4.task24.Account;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
 * всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

public class Task24 {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer; 
		ArrayList<Account> list;
		
		bank.addCustomer("MP442242", "Ivan Ivanov");
		bank.createAccount("MP442242", 1000);
		bank.createAccount("MP442242", 2000);
		bank.createAccount("MP442242", -1000);
		bank.addCustomer("MP442242", "Ivan Ivanovsky");
		
		customer = bank.findCustomer("MP442242");
		list = bank.findAccountsSorted(customer);
		System.out.println("Accounts of customer " + customer);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		bank.addCustomer("MP552242", "Petr Petrovsky");
		customer = bank.findCustomer("MP552242");
		bank.createAccount(customer, 500);
		bank.createAccount(customer, 2500);
		bank.createAccount(customer, 1500);
		//bank.findAccounts(customer).get(0).addTransaction(1000);

		System.out.println("Accounts of customer " + customer);
		list = bank.findAccountsSorted(customer);
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("All accounts");
		list = bank.findAccounts();
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Accounts operations");
		System.out.println(bank.findAccounts(customer).get(0));
		bank.transaction(bank.findAccounts(customer).get(0), 1000);
		System.out.println(bank.findAccounts(customer).get(0));
		bank.disableAccount(bank.findAccounts(customer).get(0));
		bank.transaction(bank.findAccounts(customer).get(0), 2000);
		System.out.println(bank.findAccounts(customer).get(0));
		bank.enableAccount(bank.findAccounts(customer).get(0));
		System.out.println(bank.findAccounts(customer).get(0));
		bank.transaction(bank.findAccounts(customer).get(0), 2000);
		System.out.println(bank.findAccounts(customer).get(0));
		
		System.out.println("Accounts of customer " + customer);
		list = bank.findAccountsSorted(customer);
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Accounts of customer " + bank.findCustomer("MP442242"));
		list = bank.findAccountsSorted(bank.findCustomer("MP442242"));
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
