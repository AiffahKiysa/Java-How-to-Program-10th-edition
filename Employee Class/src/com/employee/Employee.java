package com.employee;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		
		//If the monthly salary is not positive, do not set its value.
		if (monthlySalary >= 0) {
			this.monthlySalary = monthlySalary;
		}
	}
	
	// Provide a set and a get method for each instance variable
	public String get_firstName() {
		return firstName;
	}
	
	public String get_lastName() {
		return lastName;
	}
	
	public double get_monthlySalary() {
		return monthlySalary;
	}
	
}
