package com.quadrilateral;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point A = new Point(1,1);
		Point B = new Point(9,1);
		Point C = new Point(9,5);
		Point D = new Point(1,5);
		
		//test Quadrilateral
		Quadrilateral quadrilateral1 = new Quadrilateral(A, B, C, D);
		System.out.println(quadrilateral1.toString());
		
		//test Rectangle
		Rectangle rectangle1 = new Rectangle(A, B, C, D);
		System.out.println("Area of rectangle is " + rectangle1.Area() + "\n");
		
		Point E = new Point(2,2);
		Point F = new Point(6,2);
		Point G = new Point(6,6);
		Point H = new Point(2,6);
		
		//test Quadrilateral
		Quadrilateral quadrilateral2 = new Quadrilateral(E, F, G, H);
		System.out.println(quadrilateral2.toString());
				
		//test Square
		Square square1 = new Square(E, F, G, H);
		System.out.println("Area of square is " + square1.Area() + "\n");
		
		Point I = new Point(1,3);
		Point J = new Point(10,3);
		Point K = new Point(10,9);
		Point L = new Point(3,9);
		
		//test Quadrilateral
		Quadrilateral quadrilateral3 = new Quadrilateral(I, J, K, L);
		System.out.println(quadrilateral3.toString());
		
		//test Trapezoid
		Trapezoid trapezoid1 = new Trapezoid(I, J, K, L);
		System.out.println("Area of trapezoid is " + trapezoid1.Area() + "\n");
		
		Point M = new Point(4,2);
		Point N = new Point(10,2);
		Point O = new Point(7,7); 
		Point P = new Point(1,7);
		
		//test Quadrilateral
		Quadrilateral quadrilateral4 = new Quadrilateral(M, N, O, P);
		System.out.println(quadrilateral4.toString());
		
		//test Parallelogram
		Parallelogram parallelogram1 = new Parallelogram(M, N, O, P);
		System.out.println("Area of parallelogram is " + parallelogram1.Area() + "\n");

	}

}
