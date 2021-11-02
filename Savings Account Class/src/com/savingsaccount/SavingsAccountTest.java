package com.savingsaccount;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Balance: " + saver1.toString());
        System.out.println("Balance: " + saver2.toString());
        System.out.println("---------------------------------\n");

        for(int i=0; i<12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.println("Annual Interest Rate = 4%");
        System.out.println("New Balance: " + saver1.toString());
        System.out.println("New Balance: " + saver2.toString());
        System.out.println("---------------------------------\n");

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Increase Annual Interest Rate to 5%");
        System.out.println("Balance next month: " + saver1.toString());
        System.out.println("Balance next month: " + saver2.toString());
        System.out.println("---------------------------------\n");

    }
}

