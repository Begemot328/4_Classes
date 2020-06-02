package by.module4.task12;

import java.io.OutputStream;
import java.io.PrintStream;

public class Test2 {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getMax() {
		return Math.max(this.x, this.y);
	}
	
	public int getSum() {
		return this.x + this.y;
	}
	
	public void  printX(PrintStream out) {
		out.println("x= " + this.x);
	}
	
	public void  printY(PrintStream out) {
		out.println("y= " + this.y);
	}
	
	public void  printX() {
		System.out.println("x= " + this.x);
	}
	
	public void  printY() {
		System.out.println("y= " + this.y);
	}
}
