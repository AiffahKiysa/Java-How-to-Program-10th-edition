package com.heart;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//  prompts for the person’s information
		System.out.println("Your first name : ");
		String firstName = input.nextLine();
		System.out.println("Your last name : ");
		String lastName = input.nextLine();
		System.out.println("Your date of birth");
		System.out.println("Month : ");
		int month = input.nextInt();
		System.out.println("Day : ");
		int day = input.nextInt();
		System.out.println("Year : ");
		int year = input.nextInt();
		
		// instantiates an object of class HeartRates
		HeartRates human1 = new HeartRates(firstName, lastName, month, day, year);
		
		System.out.println("\n--------------------------");
		System.out.println("Personal's Information : ");
		System.out.println(human1.get_firstName() + " " + human1.get_lastName());
		System.out.println("Date of birth   : " + human1.get_month() + "/" + human1.get_day() + "/" + human1.get_year());
		System.out.println("Age\t\t: " + human1.Age());
		System.out.println("\n--------------------------");
		
		System.out.println("Maximum heart rate : " + human1.maxHeartRate());
		System.out.println("Target heart rate range : " + human1.targetMinHeartRate() + " - " + human1.targetMaxHeartRate());
		
		input.close();
	}

}
