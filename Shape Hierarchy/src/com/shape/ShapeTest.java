package com.shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(4);
		Square square = new Square(4);
		Triangle triangle = new Triangle(6, 4);
		Cube cube = new Cube(4);
		Sphere sphere = new Sphere(3);
		Tetrahedron tetrahedron = new Tetrahedron(4);
		
		Shape[] shapes = new Shape[6];
		
		shapes[0] = circle;
		shapes[1] = square;
		shapes[2] = triangle;
		shapes[3] = cube;
		shapes[4] = sphere;
		shapes[5] = tetrahedron;
		
		for(Shape shape : shapes) {
			if(shape instanceof TwoDimensionalShape) {
				System.out.println(shape.getClass().getName() + "\nArea\t: " + shape.getArea());
			}
			if(shape instanceof ThreeDimensionalShape) {
				System.out.println(shape.getClass().getName() + "\nArea\t: " + shape.getArea() + "\nVolume\t: " + ((ThreeDimensionalShape)shape).getVolume());
			}
		}
	}

}
