package by.module4.task24;

public class Account implements Comparable<Account>{
	private int iD;
	private Customer owner;
	private double account;
	private boolean active;
	
	Account(int iD, Customer owner) {
		this.iD = iD;
		this.owner = owner;
		this.active = true;
	}
	
	Account(int iD, Customer owner, double account) {
		this.iD = iD;
		this.owner = owner;
		this.account = account;
		this.active = true;
	}

	public int getID() {
		return iD;
	}

	void setID(int iD) {
		this.iD = iD;
	}

	public Customer getOwner() {
		return owner;
	}

	void setOwner(Customer owner) {
		this.owner = owner;
	}

	public double getAccount() {
		return account;
	}

	void addTransaction(double amount) {
		if (active) {
			this.account += amount;
		} else {
			System.out.println("Account is disabled");
		}
	}
	
	void close() {
		this.account = 0;
		active = false;
	}

	public boolean isActive() {
		return active;
	}
	
	void setActive(boolean active) {
		this.active = active;
	}

	public int compareTo(Account account) {
		if (this.account > account.getAccount()) {
			return 1;
		} else if (this.account == account.getAccount()) {
			return 0;
		}
		return -1;
	}

	@Override
	public String toString() {
		String result;
		result =  "Account [iD=" + iD + ", owner=" + owner + ", account=" + account;
		if (active) {
			result += ", is ";
		} else {
			result += ", is not ";
		}
		result += " active]";
		return result;
	}
}
