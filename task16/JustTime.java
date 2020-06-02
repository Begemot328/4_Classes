package by.module4.task16;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class JustTime {
	final static long SIXTY = 60;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public JustTime() {
		this.setHours(0);
		this.setMinutes(0);
		this.setSeconds(0);
	}
	
	public JustTime(long milliseconds) {
		this.hours = (int) (milliseconds / 1000. / SIXTY / SIXTY);
		this.minutes = (int) ((milliseconds - hours * SIXTY * SIXTY * 1000.) 
						/ 1000. / SIXTY);
		this.seconds = (int) ((milliseconds - minutes * SIXTY * 1000. 
						- hours * SIXTY * SIXTY * 1000.) / 1000.);
	}
	
	public JustTime(int hours, int minutes) {
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(0);
	}
	
	public JustTime(int hours, int minutes, int seconds) {
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}
	
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours <= 23) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds <= 59) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}

	public String toString() {
		String result;
		Formatter formatter = new Formatter();
		formatter.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);
		return formatter.toString();
	}
	
	public int compareTo(JustTime time) {
		if (this.getHours() > time.getHours()) {
			return 1;
		} else if (this.getHours() < time.getHours()) {
			return -1;
		}
		if (this.getMinutes() > time.getMinutes()) {
			return 1;
		} else if (this.getMinutes() < time.getMinutes()) {
			return -1;
		}
		if (this.getSeconds() > time.getSeconds()) {
			return 1;
		} else if (this.getSeconds() < time.getSeconds()) {
			return -1;
		}
		return 0;
	}
}
