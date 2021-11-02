package com.heart;

public class HeartRates {
	private String firstName;
	private String lastName;
	private int month, day, year;
	
	public HeartRates(String firstName, String lastName, int month, int day, int year) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public void set_dateOfbirth(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	// For each attribute provide set and get methods
	public String get_firstName() {
		return firstName;
	}
	
	public String get_lastName() {
		return lastName;
	}
	
	public int get_month() {
		return month;
	}
	
	public int get_day() {
		return day;
	}
	
	public int get_year() {
		return year;
	}
	
	// method that calculates and returns the person’s age
	public int Age() {
		return 2021 - year;
	}
	
	// method that calculates and returns the person’s maximum heart rate
	public int maxHeartRate() {
		return 220 - Age();
	}
	
	// method that calculates and returns the person’s target heart rate
	public double targetMinHeartRate() {
		return 0.5 * maxHeartRate();
	}
	public double targetMaxHeartRate() {
		return 0.85 * maxHeartRate();
	}

}
