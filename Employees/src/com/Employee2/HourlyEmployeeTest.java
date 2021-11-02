package com.Employee2;

public class HourlyEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test if hours > 40
		HourlyEmployee Employee1 = new HourlyEmployee ("Aiffah", "Kiysa", "5025201202", 45, 500.000);
		System.out.println(Employee1.toString());
		System.out.println("---------------------------------");
		
		//test if hours <= 40
		HourlyEmployee Employee2 = new HourlyEmployee ("Kiysa", "Waafi", "5025201202", 35, 500.000);
		System.out.println(Employee2.toString());
		System.out.println("---------------------------------");
	}

}
