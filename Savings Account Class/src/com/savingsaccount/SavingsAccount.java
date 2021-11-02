package com.savingsaccount;

public class SavingsAccount{
    private static double annualInterestRate;
    private double savingsBalance;

    // constructor
    public SavingsAccount(double savingsBalance){
    	// TODO Auto-generated constructor stub
        this.savingsBalance = savingsBalance;
    }
    
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    
    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }
    
    public static double modifyInterestRate(double newInterestRate){
    	annualInterestRate = newInterestRate;
    	return annualInterestRate;
    }
    
    public String toString(){
        return String.format("%.2f", getSavingsBalance());
    }
}
