package by.module4.task16;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.Random;
import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 6.  Составьте  описание класса для представления времени. Предусмотрте  возможности установки времени и 
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае 
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на 
 * заданное количество часов, минут и секунд. 
 * 
 */

public class Task16 {
	
	public static void main(String[] args) {
		JustTime time1;
		JustTime time2;
		
		time1 = new JustTime();
		System.out.println(time1);
		time1.setHours(12);
		System.out.println(time1);
		time1.setHours(-1);
		System.out.println(time1);
		time1.setHours(25);
		System.out.println(time1);
		time1.setMinutes(59);
		System.out.println(time1);
		time1.setMinutes(61);
		System.out.println(time1);
		time1.setMinutes(-1);
		System.out.println(time1);
		time1 = new JustTime(12, 10);
		System.out.println(time1);
		time2 = new JustTime((3600 + 60 + 1) * 1000);
		System.out.println(time2);
		if (time1.compareTo(time2) > 0) {
			System.out.println("Время time1 " + time1 + " больше времени time2 " 
								+ time2);
		}
	}
}
