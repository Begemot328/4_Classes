package by.module4.task14;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.Random;
import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.4 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления
 * 
 */

public class Task14 {
	
	public static void main(String[] args) {
		Train[] array = new Train[10];
		String[] places = {"Брест", "Витебск", "Гродно", 
						"Молодечно", "Гомель", "Витебск",
						"Витебск", "Орша", "Орша", 
						"Молодечно"};
		int[] hours = {15, 16, 12, 11, 16, 22, 23, 21, 14, 11};
		int[] minutes = {10, 22, 22, 31, 44, 51, 1, 02, 15, 20};
		
		// ввод данных
		Random random = new Random(100);
		for (int i = 0; i < 10; i++) {
			array[i] = new Train(random.nextInt(100) + 1, new JustTime(hours[i], minutes[i]), places[i]);
		}
		// вывод данных
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// проверка работы класса
		sortByNumber(array);
		// вывод данных
		System.out.println("sortByNumber");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// проверка работы класса
		sortByDestination(array);
		// вывод данных
		System.out.println("sortByDestination");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void sortByNumber(Train[] array) {
		// сортировка поездов по номеру
		TrainComparator comparator = TrainComparator.getInstance();
		int counter;
		int n;
		Train temp;
		
		counter = 0;
		n = array.length;
		comparator.setIndex(TrainSortingIndex.BY_NUMBER);
		
		do {
			if (comparator.compare(array[counter], array[counter + 1]) <= 0) {
				counter++;
			} else {
				temp = array[counter];
				array[counter] = array[counter + 1];
				array[counter + 1] = temp;
				counter--;
			}
			if (counter < 0) {
				counter  = 0;
			}
		} while (counter < n - 1);
	}
	
	public static void sortByDestination(Train[] array) {
		// сортировка поездов по пункту назначения
		TrainComparator comparator = TrainComparator.getInstance();
		int counter;
		int n;
		Train temp;
		
		counter = 0;
		n = array.length;
		comparator.setIndex(TrainSortingIndex.BY_PLACE);
		
		do {
			if (comparator.compare(array[counter], array[counter + 1]) < 0) {
				counter++;
			} else if ((comparator.compare(array[counter], array[counter + 1]) == 0)){
				comparator.setIndex(TrainSortingIndex.BY_TIME);
				if (comparator.compare(array[counter], array[counter + 1]) <= 0) {
					counter++;
				} else {
					temp = array[counter];
					array[counter] = array[counter + 1];
					array[counter + 1] = temp;
					counter--;
				}
				comparator.setIndex(TrainSortingIndex.BY_PLACE);
			} else {
				temp = array[counter];
				array[counter] = array[counter + 1];
				array[counter + 1] = temp;
				counter--;
			}
			if (counter < 0) {
				counter  = 0;
			}
		} while (counter < n - 1);
	}
}
