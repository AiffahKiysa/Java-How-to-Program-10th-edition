package com.shape;

public class Circle extends TwoDimensionalShape {
	private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
    	return radius;
    }
	
	public double getArea() {
		double area = Math.PI * Math.pow(getRadius(), 2);
		return area;
	}

}
