package com.quadrilateral;

public class Quadrilateral {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	public Quadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }
	
	public Point getPointA() {
		return pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	public Point getPointD() {
		return pointD;
	}

	public String toString() {
        return String.format(pointA.toString() + "\n" + pointB.toString() + "\n" +  pointC.toString() + "\n" + pointD.toString());
    }
}
