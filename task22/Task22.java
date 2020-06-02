package by.module4.task22;


/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */
public class Task22 {

	public static void main(String[] args) {
		Car car1;
		Car car2;
		
		car1 = new Car();
		car2 = new Car("VW Polo", 1.6, 92, 40, 8, "sh", "wrrrrrrrr" );

		System.out.println("Car #1 " + car1.getName());
		System.out.println("Car #2 " + car2.getName());
		
		car1.refuel();
		car2.refuel();
		System.out.println("Car #1 drive");
		 do {
			 car1.drive();
		 } while (car1.isOk());

		 car1.refuel();
		
		do {
			 car1.drive();
		} while (car1.isOk());

		System.out.println("Car #2 drive");
		do {
			 car2.drive();

			 break;
		 } while (car1.isOk());

		 car2.refuel();
		
		do {
			 car2.drive();
		} while (car2.isOk());
	}
}
