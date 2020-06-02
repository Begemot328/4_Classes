package by.module4.task13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.3.  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10
 * 
 */

public class Task13 {
	
	public static void main(String[] args) {
		int[] groupNumber =  {1, 2, 1, 2, 3, 4, 6, 1, 3, 1};
		Student[] array = new Student[10];
		String[] names = {"Иванов И.И.", "Иванов И.П.", "Иванков В.И.", 
						"Спииванков В.К.", "Иванков В.И.", "Инков В.С.",
						"Иван В.П.", "Канков Д.И.", "Танков В.И.", 
						"Поплавков В.И."};
		
		// ввод данных
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			array[i] = new Student(names[i], groupNumber[i]);
			for (int j = 0; j < 5; j++) {
				try {
					array[i].addMark(10 - random.nextInt(10 - i));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		// проверка работы класса
		for (int i = 0; i < 10; i++) {
			if (checkMarks(array[i], 9)) {
				System.out.println("Студент " + array[i].getName() +  " из группы " + array[i].getGroupNumber() + " - отличник!");
			}
		}
	}
	
	public static boolean checkMarks(Student student, int lowerMark) {
		boolean result = true;
		
		if (lowerMark <= 0) {
			return false;
		}
		for (int i = 0; i < student.getMarks().length; i++) {
			if (lowerMark > student.getMarks()[i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
