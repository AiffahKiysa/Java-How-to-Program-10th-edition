package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> memory = new ArrayList<Double>();
		
		double operandA, result = 0.0;
		char operation = 0;
		
		System.out.println("------------------------------------");
		System.out.println("V for View Memory");
		System.out.println("R for Reset");
		System.out.println("X for Close");
		System.out.println("------------------------------------");
		System.out.println("Input your number : ");
		operandA = scanner.nextDouble();
		result = operandA;
		
		while(scanner.hasNext()) {	
			operation = scanner.next().charAt(0);
			
			if (operation == 'R'){
				result = 0.0;
				memory.clear();
				System.out.println("Memory Reset ");
				System.out.println("Input your number : ");
				operandA = scanner.nextDouble();
				result = operandA;
			} 
			
			else if (operation == 'V') {
				System.out.println("1. View result ke- ");
				System.out.println("2. View all");
				System.out.println("3. Back");
				System.out.println("------------------------------------");
				System.out.println("Pilihan : ");
				
				while(scanner.hasNext()) {
					
					int pilihan = scanner.nextInt();
					if (pilihan == 1) {
						System.out.println("------------------------------------");
						System.out.println("Index ke- ");
						int i = scanner.nextInt();
						System.out.println(memory.get(i));
					}
					
					else if (pilihan == 2){
						System.out.println("------------------------------------");
						for (int i = 0; i < memory.size(); i++) {
							System.out.println(memory.get(i));
						}
					}
					
					else {
						break;
					}
					
					System.out.println("------------------------------------");
					System.out.println("Pilihan : ");
				}
				System.out.println("------------------------------------");
				System.out.println("Input your operation and number : ");
					
			}
			
			
			else if (operation == 'X'){
				System.out.println("--END--");
				break;
			}
			
			else {
				operandA = scanner.nextDouble();
				if (operation ==  '+') {
					result = penjumlahan(result, operandA);
				}
				else if (operation == '-') {
					result = pengurangan(result, operandA);
				}
				else if (operation == '*') {
					result = perkalian(result, operandA);
				}
				else if (operation == '/') {
					result = pembagian(result, operandA);
				}
				else if (operation == '%') {
					result = modulo(result, operandA);
				}
				
				memory.add(result);
				System.out.println("result = " + result);
				System.out.println("------------------------------------");
			}
		}
		
		scanner.close();
	}
	
	public static double penjumlahan(double a, double b) {
		double c = a + b;
		return c;
	}
	public static double pengurangan(double a, double b) {
		double c = a - b;
		return c;
	}
	public static double perkalian(double a, double b) {
		double c = a * b;
		return c;
	}
	public static double pembagian(double a, double b) {
		double c = a / b;
		return c;
	}
	public static double modulo(double a, double b) {
		double c = a % b;
		return c;
	}
}
