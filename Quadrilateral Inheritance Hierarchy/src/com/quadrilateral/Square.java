package com.quadrilateral;

public class Square extends Quadrilateral{

	public Square(Point squareA, Point squareB, Point squareC, Point squareD) {
		// TODO Auto-generated constructor stub
		super(squareA, squareB, squareC, squareD);
		
	}
	
	public double Area() {
		return Math.pow((getPointB().getX()-getPointA().getX()), 2);
	}

}
