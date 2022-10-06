package com.quadrilateral;

public class Trapezoid extends Quadrilateral{
	
	public Trapezoid(Point trapezoidA, Point trapezoidB, Point trapezoidC, Point trapezoidD) {
		// TODO Auto-generated constructor stub
		super(trapezoidA, trapezoidB, trapezoidC, trapezoidD);
	}
	
	public double Area() {
		double height = getPointD().getY() - getPointA().getY();
		return 0.5 * height * ((getPointB().getX()-getPointA().getX()) + (getPointC().getX()-getPointD().getX()));
	}

}
