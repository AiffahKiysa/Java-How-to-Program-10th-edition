package com.shape;

public class Tetrahedron extends ThreeDimensionalShape{
	private double side;

	public Tetrahedron(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getArea() {
		return Math.pow(getSide(), 2) * Math.sqrt(3);
	}
	
	public double getVolume() {
		return Math.pow(getSide(), 3) * Math.sqrt(2) / 12;
	}

}
