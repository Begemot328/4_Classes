package by.module4.task11;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 * 
 */

public class Task11 {
	public static final String LOW_LINE = "_"; 
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
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
