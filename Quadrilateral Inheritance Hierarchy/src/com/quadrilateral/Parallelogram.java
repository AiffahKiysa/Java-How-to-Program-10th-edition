package com.quadrilateral;

public class Parallelogram extends Quadrilateral{
	
	public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
		// TODO Auto-generated constructor stub
		super(p1, p2, p3, p4);
	}
	
	public double Area() {
		double height = getPointD().getY() - getPointA().getY();
		return 0.5 * (getPointB().getX()-getPointA().getX()) * height;
	}

}
