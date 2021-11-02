package com.shape;

public class Cube extends ThreeDimensionalShape{
	private double edge;

	public Cube(double edge) {
		// TODO Auto-generated constructor stub
		this.edge = edge;
	}
	
	public double getEdge() {
		return edge;
	}
	
	public double getArea() {
		return 6 * Math.pow(getEdge(), 2);
	}
	
	public double getVolume() {
		return Math.pow(getEdge(), 3);
	}

}
