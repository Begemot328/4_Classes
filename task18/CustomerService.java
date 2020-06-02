package by.module4.task18;

import by.module4.task14.Train;
import by.module4.task14.TrainSortingIndex;

public class CustomerService {
	private Customer[] customers = new Customer[10];
	int customerCounter;
	
	public void addCustomer(Customer customer) {
		customers[customerCounter] = customer;
		customerCounter++;
	}
	
	public Customer getCustomer(int number) {
		if (number >= customers.length || number < 0) {
			return null;
		}
		return customers[number];
	}
	
	public Customer getCustomerByID(int id) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getId() == id) {
				return customers[i];
			}
		}
		return null;
	}
	
	public int compare(Customer customer1, Customer customer2) {
		if (customer1.getLastName().equals(customer2.getLastName())) {
			if (customer1.getFirstName().equals(customer2.getFirstName())) {
				if (customer1.getSurName().equals(customer2.getSurName())) {
					return 0;
				} else {
					return customer1.getSurName().compareTo(customer2.getSurName());
				}
			} 
			return customer1.getFirstName().compareTo(customer2.getFirstName());
		}
		return customer1.getLastName().compareTo(customer2.getLastName());
	}
	
	public Customer[] getCustomersByLastname () {
		Customer[] customers = new Customer[this.customers.length];
		int counter;
		int n;
		Customer temp;
		n = customers.length;
		counter = 0;
		customers = this.customers.clone();
			
		do {
			if (customers[counter + 1] == null || customers[counter] == null) {
				break;
			}
			if (compare(customers[counter], customers[counter + 1]) <= 0) {
				counter++;
			} else {
				temp = customers[counter];
				customers[counter] = customers[counter + 1];
				customers[counter + 1] = temp;
				counter--;
			}
			if (counter < 0) {
				counter  = 0;
			}
		} while (counter < n - 1);
		return customers;
	}
	
	public Customer[] getCustomersByCardNumber (int start, int end) {		
		Customer[] customers = new Customer[this.customers.length];
		int counter = 0;
		customers = this.customers.clone();
		for (int i = 0; i < this.customers.length; i++) {
			if (customers[i] == null) {
				break;
			}
			if (this.customers[i].getCardNumber() >= start 
					&& this.customers[i].getCardNumber() < end) {
				customers[counter] = this.customers[i];
				counter++;
			}
		}
		return customers;
	}
}
