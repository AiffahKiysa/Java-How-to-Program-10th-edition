package com.Employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		// TODO Auto-generated constructor stub
		super (firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Incorrect gross sale"); 
		}
		this.baseSalary = baseSalary;
		
	}

	public double getBaseSalary() {
        return this.baseSalary;
    }
	
	public double earnings(){
        return baseSalary + super.earnings();
    }
	
	public String toString() {
		return String.format(super.toString() + "\nBase Salary\t\t:" + getBaseSalary() + "\nEarnings\t\t:" + earnings());
	}
}
