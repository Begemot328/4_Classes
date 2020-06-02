package by.module4.task25;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок. 
 */

public class Task25 {

	public static void main(String[] args) {
		TourOperator operator = new TourOperator();
		Trip trip;
		
		trip =	operator.createTour("Nizza vacations");
		operator.setDestination(trip, "Nizza");	
		operator.setAim(trip, TravelAim.REST);
		operator.setFood(trip, Food.BREAKFAST_ONLY);
		operator.setTransport(trip, Transport.PLANE);
		operator.setPrice(trip, 300);
		operator.setLength(trip, 3);	
		System.out.println(trip);
		operator.addTour(trip);
		
		trip =	operator.createTour("Nizza weekend");
		operator.setDestination(trip, "Nizza");	
		operator.setAim(trip, TravelAim.REST);
		operator.setFood(trip, Food.BREAKFAST_ONLY);
		operator.setTransport(trip, Transport.PLANE);
		operator.setPrice(trip, 200);
		operator.setLength(trip, 2);	
		System.out.println(trip);
		operator.addTour(trip);
		
		trip =	operator.createTour("Rome excursion");
		operator.setDestination(trip, "Rome");	
		operator.setAim(trip, TravelAim.EXCURSION);
		operator.setFood(trip, Food.NO_FOOD);
		operator.setTransport(trip, Transport.BUS);
		operator.setPrice(trip, 400);
		operator.setLength(trip, 5);	
		System.out.println(trip);
		operator.addTour(trip);
		
		trip =	operator.createTour("Carlovi vari vacations");
		operator.setDestination(trip, "Praha");	
		operator.setAim(trip, TravelAim.HEALTHCARE);
		operator.setFood(trip, Food.ALL_INCLUSIVE);
		operator.setTransport(trip, Transport.BUS);
		operator.setPrice(trip, 500);
		operator.setLength(trip, 7);	
		System.out.println(trip);
		operator.addTour(trip);
		
		trip =	operator.createTour("IKEA raid");
		operator.setDestination(trip, "Warsaw");	
		operator.setAim(trip, TravelAim.SHOPPING);
		operator.setFood(trip, Food.NO_FOOD);
		operator.setTransport(trip, Transport.BUS);
		operator.setPrice(trip, 100);
		operator.setLength(trip, 3);	
		System.out.println(trip);
		operator.addTour(trip);
		
		trip =	operator.createTour("Trip in progress");
		System.out.println(trip);
		operator.addTour(trip);
		
		System.out.println("All trips");
		printTrips(operator.findTours());
		System.out.println("FOOD ALL_INCLUSIVE");
		printTrips(operator.findTours(SearchingIndex.FOOD, Food.ALL_INCLUSIVE));
		System.out.println("TRANSPORT ALL_INCLUSIVE");
		printTrips(operator.findTours(SearchingIndex.TRANSPORT, Food.ALL_INCLUSIVE));
		System.out.println("PRICE_LOWER 400");
		printTrips(operator.findTours(SearchingIndex.PRICE_LOWER, 400));
		System.out.println("PRICE_HIGHER 300");
		printTrips(operator.findTours(SearchingIndex.PRICE_HIGHER, 300));
		System.out.println("PRICE_HIGHER 300 & PRICE_LOWER 400");
		printTrips(operator.findTours(operator.findTours(
				SearchingIndex.PRICE_LOWER, 400), SearchingIndex.PRICE_HIGHER, 300));
		System.out.println("CUSTOM");
		printTrips(operator.findTours(
				operator.findTours(
				operator.findTours(SearchingIndex.TRANSPORT, Transport.PLANE), 
									SearchingIndex.PRICE_LOWER, 500),
									SearchingIndex.PRICE_HIGHER, 100)); 
		System.out.println("CUSTOM PRAHA");
		printTrips(operator.findTours(
				operator.findTours(
				operator.findTours(
				operator.findTours(SearchingIndex.DESTINATION, "Praha"), 
									SearchingIndex.TRANSPORT, Transport.BUS), 
									SearchingIndex.PRICE_LOWER, 500),
									SearchingIndex.PRICE_HIGHER, 300)); 
	}
	
	public static void printTrips(ArrayList<Trip> list) {
		if (list == null || list.size() == 0) {
			System.out.println("EMPTY");
			return;
		}
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
