package com.date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date(3, 22, 2004);
		Date date2 = new Date(9, 20, 2021);
		Date date3 = new Date(12, 2, 2002);
		
		System.out.println("Month / Day / Year : ");
		date1.displayDate();
		date2.displayDate();
		date3.displayDate();

	}

}
