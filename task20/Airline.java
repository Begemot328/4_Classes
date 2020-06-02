package by.module4.task20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Airline {
	private String destination;
	private String planeType;
	private int number;
	private Date time;
	private Map<Integer,Boolean> timeTable;
	
	public Airline (int number, String destination, Date time, String planeType) {
		this.timeTable = new TreeMap<Integer,Boolean>();
		for (int i = 1; i <= 7; i++) {
			this.timeTable.put(i, false);
		}	
		setTime(time);
		setNumber(number);
		setPlaneType(planeType);
		setDestination(destination);
	} 

	
	public Airline (int number, String destination, Date time, String planeType, int ... args) {
		this(number, destination, time, planeType);
		for (int j = 0; j < args.length; j++) {
			for (int i = 1; i <= 7; i++) {
				if (args[j] == i) {
					this.timeTable.put(i, true);
				}
			}	
		}
	}
	
	public Airline (int number, String destination, int hours, int minutes, String planeType, int ... args) {
		this(number, destination, new Date(0), planeType, args);
		
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
		setTime(calendar.getTime());
	}
	
	
	public Airline (int number, String destination, Date time, int ... args) {
		this(number, destination, time, "", args);
	}
	
	public Airline (int number, String destination, int hours, int minutes, int ... args) {
		this(number, destination, hours, minutes, "", args);
	}
	
	public String toString() {
		String result;
		Calendar calendar;
		calendar = Calendar.getInstance();
		calendar.setTime(this.time);
		result = "Airline №" + number + " to " + destination;
		result += new SimpleDateFormat(" HH:mm").format(calendar.getTime());
		if (!planeType.isEmpty()) {
			result += " on the plane type " + planeType;
		}
		result += " flyes on";
		for (int i = 1; i <= 7; i++) {
			if (timeTable.get(i)) {
				calendar.set(Calendar.DAY_OF_WEEK, i);
				result +=  " " + new SimpleDateFormat(
						"EEEEEEEEEEEEEEEEE", Locale.UK).format(calendar.getTime());
			}
		}
		return result; 
	}
	
	
	public void setDays(int ... args) {
		for (int i = 1; i <= 7; i++) {
			if (args[i - 1] == i) {
				this.timeTable.put(i, true);
			} 
		}	
	}
	
	public void resetDays(int ... args) {
		for (int i = 1; i <= 7; i++) {
			if (args[i - 1] == i) {
				this.timeTable.put(i, false);
			} 
		}	
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public void setNumber(int number) {
		if (number > 0) {
			this.number = number;
		} else {
			this.number = 0;
		}
	}

	public String getPlaneType() {
		return planeType;
	}
	
	public Date getTime() {
		return time;
	}

	public int getNumber() {
		return number;
	}

	public Map<Integer, Boolean> getTimeTable() {
		return timeTable;
	}

	public String getDestination() {
		return destination;
	}
	
	public boolean isFlyingOn (int dayOfWeek) {
		return timeTable.get(dayOfWeek);
	}
	
	
}
