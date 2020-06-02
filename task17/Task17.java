package by.module4.task17;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.Random;
import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
 * площади, периметра и точки пересечения медиан.  
 * 
 */

public class Task17 {
	
	public static void main(String[] args) {
		Point p1 = new Point(0, 6);
		Point p2 = new Point(3, 0);
		Point p3 = new Point(-3, 0);
		Point p4 = new Point(0, 6);
		Triangle triangle = null;
		try {
			triangle = new Triangle(p1, p2, p4);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			triangle = new Triangle(p1, p2, p3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Площадь треугольника " + triangle.getSquare());
		System.out.println("Периметр треугольника " + triangle.getPerimeter());
		System.out.println("Точка пересечения медиан  " + triangle.getMassCenter());
	}
}
