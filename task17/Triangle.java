package by.module4.task17;

import java.io.IOException;

public class Triangle {
	private double angle1;
	private double angle2;
	private double angle3;
	private Point point1;
	private Point point2;
	private Point point3;
	final static double ANGLE_SUM = Math.PI;
	final static double RIGHT_ANGLE = Math.PI / 2;
	
	public Triangle(Point point1, Point point2, Point point3) throws IOException {
		if (point1.equals(point2) || point1.equals(point3) || point3.equals(point2)) {
			throw new IOException("wrong input");
		}
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	public double getSquare() {
		double p;
		double a;
		double b;
		double c;
		p = getPerimeter() / 2;
		a = getSideLength (point1, point2);
		b = getSideLength (point2, point3);
		c = getSideLength (point1, point3);
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
	}
	
	public double getPerimeter() {
		return getSideLength (point1, point2) + getSideLength (point1, point3) 
				+ getSideLength (point3, point2); 
	}
	
	public double getSideLength (Point point1, Point point2) {
		return Math.sqrt(Math.pow(point1.getX() - point2.getX(),2) 
						+ Math.pow(point1.getY() - point2.getY(),2));
	}
	
	public Point getMassCenter() {
		Point center;
		center = Point.getMiddlePoint(point1, point2, 0.5);
		return Point.getMiddlePoint(point3, center, 2 / 3.);
	}
}
