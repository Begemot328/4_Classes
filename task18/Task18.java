package by.module4.task18;

/*  @author Yury Zmushko
 * 	Task 8. 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 */

public class Task18 {

	public static void main(String[] args) {
		Customer customer1;
		Customer customer2;
		Customer customer3;
		Customer customer4;
		Customer customer5;
		Customer[] customers;
		CustomerService service = new CustomerService();
		
		customer1 = new Customer(1, "Ivanov", "Ivan", "Ivanovich", 99, 9999);
		System.out.println(customer1);
		customer2 = new Customer(2, "Petrov", "Petr", "Petrovich", 23, 1765);
		System.out.println(customer2);
		customer3 = new Customer(3, "Sidorov", "Sidor", "Sidorovich", 17, 1215);
		System.out.println(customer3);
		customer4 = new Customer(4, "Kovalev", "Sergey", "Petrovich", 88, 8965);
		System.out.println(customer4);
		customer5 = new Customer(5, "Kovalev", "Petr", "Petrovich", 14, 7731);
		System.out.println(customer5);
		
		service.addCustomer(customer1);
		service.addCustomer(customer2);
		service.addCustomer(customer3);
		service.addCustomer(customer4);
		service.addCustomer(customer5);
		System.out.println("Selection by card number");
		customers = service.getCustomersByCardNumber(33, 99);
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				break;
			}
			System.out.println(customers[i]);
		}
		System.out.println("Sorting  by name");
		customers = service.getCustomersByLastname();
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				break;
			}
			System.out.println(customers[i]);
		}
		
		
	}

}
