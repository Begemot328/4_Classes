package by.module4.task15;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.Random;
import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
 * на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и 
 * произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод 
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
 * 
 */

public class Task15 {
	
	public static void main(String[] args) {
		DecimalCounter counter;
		// создание счетчика с начальным значением по умолчанию
		counter = new DecimalCounter();
		test(counter);

		// создание счетчика с произвольным начальным значением
		for (int i = 0; i < 30; i++) {
		counter = new DecimalCounter(true);
		System.out.println("new DecimalCounter(true) " + counter);
		}

		// создание счетчика с начальным значением по умолчанию
		counter = new DecimalCounter(false);
		System.out.println("new DecimalCounter(false) " + counter);
		// создание счетчика с начальным значением вне диапазона
		counter = new DecimalCounter(111);
		System.out.println("new DecimalCounter(111) " + counter);
		counter = new DecimalCounter(2);
		System.out.println("new DecimalCounter(2) " + counter);
		// создание счетчика с начальным значением вне диапазона
		counter = new DecimalCounter(-4);
		System.out.println("new DecimalCounter(-4) " + counter);
	}
	
	public static void test(DecimalCounter counter) {
		System.out.println("Starting value = " + counter);
		for (int i = 0; i < 30; i++) {
			counter.decrease();
			System.out.println("decreasing");
			System.out.println(counter);
		}
		for (int i = 0; i < 30; i++) {
			counter.increase();
			System.out.println("increasing");
			System.out.println(counter);
		}
		System.out.println("end");
	}
}
