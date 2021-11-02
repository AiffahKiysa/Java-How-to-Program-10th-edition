package com.invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice item1 = new Invoice("A00123", "Earphone", 15, 10.5);
		// test quantity negative
		Invoice item2 = new Invoice("D00124", "Keayboard", -8, 150.5);
		// test price negative
		Invoice item3 = new Invoice("K00125", "Mouse", 10, -69);
		
		Invoice item4 = new Invoice("P00126", "Laptop", 150, 200.5);
		
		System.out.println(item1.get_partNumber() + "\t" + item1.get_partDescription());
		System.out.println(item1.get_quantity() + "\t" + item1.get_price() + "\t\t" + item1.getInvoiceAmount() + "\n");
		
		System.out.println(item2.get_partNumber() + "\t" + item2.get_partDescription());
		System.out.println(item2.get_quantity() + "\t" + item2.get_price() + "\t\t" + item2.getInvoiceAmount() + "\n");
		
		System.out.println(item3.get_partNumber() + "\t" + item3.get_partDescription());
		System.out.println(item3.get_quantity() + "\t" + item3.get_price() + "\t\t" + item3.getInvoiceAmount() + "\n");
		
		System.out.println(item4.get_partNumber() + "\t" + item4.get_partDescription());
		System.out.println(item4.get_quantity() + "\t" + item4.get_price() + "\t\t" + item4.getInvoiceAmount() + "\n");
		
		
		System.out.println("-----------------------------------");
		double total = item1.getInvoiceAmount() + item2.getInvoiceAmount() + item3.getInvoiceAmount() + item4.getInvoiceAmount();
		System.out.println("Total Invoice : \t" + total);
	}

}
