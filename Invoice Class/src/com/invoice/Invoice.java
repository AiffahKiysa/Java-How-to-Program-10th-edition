package com.invoice;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		// TODO Auto-generated constructor stub
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
		
		// If the quantity is not positive, it should be set to 0
		if (this.quantity < 0) {
			this.quantity = 0;
		}
		
		// If the price per item is not positive, it should be set to 0.0
		if (this.price < 0) {
			this.price = 0.0;
		}
	}
	
	//  Provide a set and a get method for each instance variable
	public String get_partNumber() {
		return partNumber;
	}
	
	public String get_partDescription() {
		return partDescription;
	}
	
	public int get_quantity() {
		return quantity;
	}
	
	public double get_price() {
		return price;
	}
	
	// method getInvoiceAmount that calculates the invoice amount 
	public double getInvoiceAmount() {
		return quantity * price;
	}
	
}
