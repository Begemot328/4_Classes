package by.module4.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;


/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 */
public class Task20 {

	public static void main(String[] args) throws ParseException {
		
		Airline airline1;
		Airline airline2;
		Airline airline3;
		Airline airline4;
		Airline airline5;
		Airport airport;
		
		Calendar calendar;
		calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR, 20);
		calendar.set(Calendar.MINUTE, 48);
		
		airline1 = new Airline(1, "Madrid", calendar.getTime(), 3, 2);
		System.out.println(airline1);
		airline2 = new Airline(2, "Berlin", 15, 20, 1);
		System.out.println(airline2);
		airline3 = new Airline(3, "Prague", 12, 10, "A220", 3, 5, 4);
		System.out.println(airline3);
		airline4 = new Airline(4, "London", 15, 20, 1 ,7);
		System.out.println(airline4);
		airline5 = new Airline(5, "Prague", 14, 15, 2 ,4);
		System.out.println(airline5);
		
		airport = new Airport();
		airport.addAirline(airline1);
		airport.addAirline(airline2);
		airport.addAirline(airline3);
		airport.addAirline(airline4);
		airport.addAirline(airline5);
		
	
		printOutList("All airlines", airport.getAirlineList());
		printOutList("All airlines to Prague", airport.getAirlineList("Prague"));
		printOutList("All airlines later 12.22", airport.getAirlineList(12, 22));
		printOutList("All airlines to Prague later 11.22 on Mondays", airport.getAirlineList(airport.getAirlineList(
				airport.getAirlineList(Calendar.MONDAY), "Prague"), 11, 22));
		printOutList("All airlines later 15.22", airport.getAirlineList(15,22));
	}

	public static void printOutList(String message, ArrayList<Airline> list) {
		System.out.println(message);
		if (list.isEmpty() || list == null) {
			return;
		}
		Iterator<Airline> iterator= list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
