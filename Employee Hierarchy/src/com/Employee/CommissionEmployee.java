package com.Employee;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		// TODO Auto-generated constructor stub
		super(firstName, lastName, socialSecurityNumber);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Incorrect commission rate");
		}
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Incorrect gross sale");
		}
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
		
	}

	 public double getGrossSales() {
		 return grossSales;
	 }
	 
	 public double getCommissionRate() {
		 return commissionRate;
	 }
	 
	 public double earnings(){
		 return getGrossSales() * getCommissionRate();
	 }
	    
	 public String toString(){
		 return String.format("Commission employee : \n" + super.toString() + "\ngroos sales\t\t:" + getGrossSales() + "\ncommission rate\t\t:" + getCommissionRate());
	 }
}
