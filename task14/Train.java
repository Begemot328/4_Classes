/**
 * 
 */
package by.module4.task14;

import java.sql.Time;
import java.time.LocalTime;
import java.time.OffsetTime;

/**
 * @author Yury Zmushko
 *
 */
public class Train {
	private int number;
	private String destination;
	private JustTime time;
	
	public Train(int number, JustTime time, String destination) {
		if (destination.isEmpty()) {
			throw new IllegalArgumentException("empty destination");
		}
		
		if (number <= 0) {
			throw new IllegalArgumentException("empty number");
		}
		
		this.destination = destination;
		this.number = number;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", destination=" + destination + ", time=" + time + "]";
	}
	
	public int getNumber() {
		return number;
	}

	public String getDestination() {
		return destination;
	}

	public JustTime getTime() {
		return time;
	}
	
}
