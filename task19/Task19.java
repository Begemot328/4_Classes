package by.module4.task19;

import java.util.Calendar;

/*  @author Yury Zmushko
 * 	Task 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 */

public class Task19 {

	public static void main(String[] args) {
		Book book1;
		Book book2;
		Book book3;
		Book book4;
		Book book5;
		Book[] books;
		Library library = new Library();
		
		book1 = new Book(1, "Иронический детектив", "Донцова Дарья", "ЭКСМО", 2018, 1);
		System.out.println(book1);
		book2 = new Book(2, "Гроздья гнева", "Стейнбек", "Пламя", 1967, 10);
		System.out.println(book2);
		book3 = new Book(3, "Библия", "Бог", "Производство каменных табличек", -2000, Integer.MAX_VALUE);
		System.out.println(book3);
		book3 = new Book(3, "Библия", "Бог", "РПЦ", 1990, 20);
		System.out.println(book3);
		book4 = new Book(4, "Философия Java", "Брюс Эккель", "Информатика", 2010, 100);
		System.out.println(book4);
		book5 = new Book(5, "Война и мир", "Толстой Лев", "ЭКСМО", 2000, 100);
		System.out.println(book5);
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
		System.out.println("Selection by author");
		books = library.getBooks("Толстой", SearchIndex.AUTHOR);
		bookArrayPrint(books);
		
		System.out.println("Selection by publisher");
		books = library.getBooks("эксмо", SearchIndex.PUBLISHER);
		bookArrayPrint(books);
		
		System.out.println("Selection by year");
		books = library.getBooksAfterYear(1990);
		bookArrayPrint(books);
	}
	
	public static void bookArrayPrint(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			System.out.println(i + ". " + books[i]);
		}
	}
}
