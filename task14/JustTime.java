package by.module4.task14;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class JustTime extends Date {
	final static long SIXTY = 60; 
	private int hours;
	private int minutes;
	
	public JustTime(int hours, int minutes) {
		super((hours * SIXTY + minutes) * SIXTY * 1000);
		if (hours >= 24 || hours < 0 || minutes < 0 || minutes >= 60) {
			throw new IllegalArgumentException("Wrong time format");
		}
	}
	
	public String toString() {
		String result;
		Formatter formatter = new Formatter();
		this.hours = (int) (this.getTime() / 1000. / SIXTY / SIXTY);
		this.minutes = (int) ((this.getTime() - hours * SIXTY * SIXTY * 1000.) / 1000. / SIXTY);
		formatter.format("%02d:%02d", this.hours, this.minutes);
		return formatter.toString();
	}
}
