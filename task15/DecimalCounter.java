package by.module4.task15;

public class DecimalCounter {
	int counter;
	
	public DecimalCounter() {
		counter = 0;
	}
	
	public DecimalCounter(int i) {
		if (i >=0 && i <= 9) {
			counter = i;
		} else {
			counter = i;
			this.checkLimits();
		}
	}
	
	public DecimalCounter(boolean random) {
		if (random) {
			counter = (int) (Math.random() * 10);
		} else {
			counter = 0;
		}
	}
	
	public int getCurrentValue() {
		return counter;
	}
	
	public void  increase() {
		counter++;
		this.checkLimits();
	}
	
	public void  decrease() {
		counter--;
		this.checkLimits();
	}
	
	private void checkLimits () {
		while (counter < 0) {
			counter += 10;
		}
		while (counter >= 10) {
			counter -= 10;
		}
	}
	
	public String toString() {
		return String.valueOf(counter);
	}
}
