package by.module4.task17;

public class Point {
	private double x;
	private double y;
	
	public Point(double a, double b) {
		this.x = a;
		this.y = b;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
	
	public boolean equals(Point p) {
		if (p.getX() != this.x) {
			return false;
		}
		
		if (p.getY() != this.y) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "Point (" + x + "; " + y + ")";
	}
	
	public static Point getMiddlePoint(Point p1, Point p2, double k) {
		return new Point(p1.getX() * (1. - k) + k * p2.getX(), 
						p1.getY() * (1. - k) + k *p2.getY());
	}
	
	
}
