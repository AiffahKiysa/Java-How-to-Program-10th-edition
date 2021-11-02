package com.shape;

public class Triangle extends TwoDimensionalShape{
	private double base;
	private double height;

	public Triangle(double base, double height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return base*height/2;
	}
	
}
