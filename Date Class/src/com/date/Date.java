package com.date;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) {
		// TODO Auto-generated constructor stub
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	// Provide a set and a get method for each instance variable
	public int get_month() {
		return month;
	}

	public int get_day() {
		return day;
	}
	
	public int get_year() {
		return year;
	}
	
	public void displayDate () {
		System.out.println(get_month() + "/" + get_day() + "/" + get_year());
	}
}
