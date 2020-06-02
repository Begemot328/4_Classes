package by.module4.task12;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 * класса.
 * 
 */

public class Task12 {
	public static final String LOW_LINE = "_"; 
	
	public static void main(String[] args) {
		Test2 test1 = new Test2();
		Scanner input = new Scanner(System.in);
		
		// ввод переменных
		while (true) {
			try {
				System.out.println("Введите x");
				test1.setX(input.nextInt());
				System.out.println("Введите y");
				test1.setY(input.nextInt());
				break;
			} catch (Exception e) {
				System.out.println("Введите натуральное число");
				input.next();
			}
		}
		
		// проверка работы класса
		System.out.println("сумма чисел " + test1.getSum());
		System.out.println("большее из чисел " + test1.getMax());
		test1.printX();
		test1.printY();
		test1.printX(System.out);
		test1.printY(System.out);
	}
}
