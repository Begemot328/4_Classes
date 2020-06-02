package by.module4.task24;

public class Customer {
	public String id;
	public String name;
	
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	void setId(String id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
}
