package com.Employee2;

public class HourlyEmployee extends Employee{
	private double hours;
	private double wage;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
		// TODO Auto-generated constructor stub
		super(firstName, lastName, socialSecurityNumber);
		this.hours = hours;
		this.wage = wage;
	}

	public void setHours(double hours) {
		if (hours < 0.0 || hours > 168.0) {
			throw new IllegalArgumentException("Hours wage must be >=0.0 and <= 168.0");
		}
		this.hours = hours;
	}
	
	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("Hours wage must be >= 0.0");
		}
		this.wage = wage;
	}
	
	public double getHours() {
		return hours;
	}
	
	public double getWage() {
		return wage;
	}
	
	public double earnings() {
		if (getHours() <= 40) {
            return getWage() * getHours();
		}
        else {
            return 40 * getWage() + ((getHours() - 40) * getWage() * 1.5);
        }
	}
	
	public String toString() {
		return String.format("Hourly Employee : \n" + super.toString() + "\nHours\t\t\t:" + getHours() + "\nWage per hour\t\t:" + getWage() + "\nEarnings\t\t:" + earnings());
	}
}
