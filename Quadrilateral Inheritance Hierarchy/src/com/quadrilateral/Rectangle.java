package com.quadrilateral;

public class Rectangle extends Quadrilateral{
	
    public Rectangle(Point rectangleA, Point rectangleB, Point rectangleC, Point rectangleD) {
    	// TODO Auto-generated constructor stub
    	super(rectangleA, rectangleB, rectangleC, rectangleD);
    }

    public double Area() {
        double height = getPointD().getY() - getPointA().getY();
        
        double wide = getPointB().getX() - getPointA().getX();

        return wide * height;
    }
}
