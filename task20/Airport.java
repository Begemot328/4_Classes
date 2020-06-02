package by.module4.task20;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class Airport {
	private ArrayList<Airline> list;
	
	
	public Airport() {
		list = new ArrayList<Airline>();
	}
	
	public void addAirline (Airline flight) {
		list.add(flight);
	}
	
	public Airline getAirline(int number) {
		return list.get(number);
	}
	
	public ArrayList<Airline> getAirlineList() {
		return (ArrayList<Airline>) list.clone();
	}
	
	public ArrayList<Airline> getAirlineList(String destination) {
		return getAirlineList(this.list, destination);
	}
	
	public ArrayList<Airline> getAirlineList(ArrayList<Airline> list, String destination) {
		ArrayList<Airline> result = new ArrayList<Airline>();
		Airline next;
		if (destination.isEmpty() || destination == null) {
			return null;
		}
		
		Iterator<Airline> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			next = iterator.next();
			if (next.getDestination().toLowerCase().contains(
				destination.toLowerCase())) {
				result.add(next);
			}
		} 
		return result;
	}
	
	public ArrayList<Airline> getAirlineList(ArrayList<Airline> list, int dayOfWeek) {
		ArrayList<Airline> result = new ArrayList<Airline>();
		Airline next;
		
		if (dayOfWeek < 0 || dayOfWeek > 7) {
			return null;
		}
		Iterator<Airline> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			next = iterator.next();
			if (next.isFlyingOn(dayOfWeek)) {
				result.add(next);
			}
		} 
		return result;
	}
	
	public ArrayList<Airline> getAirlineList(int dayOfWeek) {
		return getAirlineList(this.list, dayOfWeek);
	}
	
	public ArrayList<Airline> getAirlineList(ArrayList<Airline> list, Date time) {
		ArrayList<Airline> result = new ArrayList<Airline>();
		Airline next;
		Calendar calendar1;
		Calendar calendar2;
		calendar1 = Calendar.getInstance();
		calendar2 = Calendar.getInstance();
		calendar1.setTime(time);
		
		if (time == null) {
			return null;
		}
		
		Iterator<Airline> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			next = iterator.next();
			calendar2.setTime(next.getTime());
			if (calendar1.get(Calendar.HOUR) > calendar2.get(Calendar.HOUR)) {
				result.add(next);
			} else if (calendar1.get(Calendar.HOUR) == calendar2.get(Calendar.HOUR)) {
				if (calendar1.get(Calendar.MINUTE) == calendar2.get(Calendar.MINUTE)) {
					result.add(next);
				}
			}
		} 
		return result;
	}
	
	public ArrayList<Airline> getAirlineList(Date time) {
		return getAirlineList(this.list, time);
	}
	
	public ArrayList<Airline> getAirlineList(ArrayList<Airline> list, int hours, int minutes) {
		Calendar calendar;
		calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR, hours);
		calendar.set(Calendar.MINUTE, minutes);
		
		if (hours < 0 || hours > 23) {
			hours = 0;
		}
		if (minutes < 0 || minutes > 59) {
			minutes = 0;
		}
		return getAirlineList(list, calendar.getTime());
	}
	
	public ArrayList<Airline> getAirlineList(int hours, int minutes) {
		return getAirlineList(this.list, hours, minutes);
	}
}
