package by.module4.task23;


/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры.  
 */

public class Task23 {
	

	public static void main(String[] args) {
		
	City city1;
	City city2;
	City city3;
	
	Region region1;
	Region region2;
	
	State state1;
	
	city1 = new City("Brest");

	city2 = new City("Vitebsk");

	city3 = new City("Minsk");
	
	region1 = new Region("Brestskaya obl.");
	region1.setCapital(city1);
	region1.setSquare(32786);
	region2 = new Region("Vitebskaya obl.", city2);
	region2.setSquare(40051);
	
	state1 = new State("Belarus", city3);
	state1.addRegion(region1);
	state1.addRegion(region2);
	state1.addRegion(region1);
	
	System.out.println("Results");
	System.out.println("State " + state1);
	System.out.println("State capital " + state1.getCapital());
	System.out.println("State regions quantity " + state1.getList().size());
	System.out.println("State square " + state1.getSquare());
	}
}
