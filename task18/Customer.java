package by.module4.task18;

public class Customer {
	private int cardNumber;
	private int accountNumber;
	private int id;
	private String firstName;
	private String lastName;
	private String surName;
	
	public Customer() {
	}
	public Customer(int id, String lastName, String firstName, String surName, 
					int cardNumber, int accountNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.surName = surName;
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
	}

	public int getCardNumber() {
		return cardNumber;
	}
	
	public String toString() {
		return "Customer (" + id + ") " + lastName + " " + firstName 
				+ " " + surName + " card number: " + cardNumber 
				+ " account number: " + accountNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
}
