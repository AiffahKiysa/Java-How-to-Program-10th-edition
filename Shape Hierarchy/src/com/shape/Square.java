package com.shape;

public class Square extends TwoDimensionalShape{
	public double side;
	
	public Square(double side) {	
		// TODO Auto-generated constructor stub
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	public double getArea() {
		double area = getSide() * getSide();
		return area;
	}
}
