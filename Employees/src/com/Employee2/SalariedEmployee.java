package com.Employee2;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public SalariedEmployee (String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		// TODO Auto-generated constructor stub
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		if(weeklySalary<0.0){
            throw new IllegalArgumentException("Weekly salary must be >=0.0");
        }
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public String toString() {
		return String.format("Salaried Employee : \n" + super.toString() + "\nWeekly Salary\t\t:" + getWeeklySalary());
	}

}
