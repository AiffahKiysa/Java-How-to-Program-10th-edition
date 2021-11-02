package com.shape;

public class Sphere extends ThreeDimensionalShape {
	private double radius;

	public Sphere(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(getRadius(), 2);
	}
	
	public double getVolume() {
		return 4 / 3 * Math.PI * Math.pow(getRadius(), 3);
	}

}
