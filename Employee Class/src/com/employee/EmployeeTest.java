package com.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee test1 = new Employee("Aiffah", "Kiysa", 500);
		
		//test monthly salary negative
		Employee test2 = new Employee("Kaysa", "Waafi", -12);
		
		double yearly_salary1 = test1.get_monthlySalary() * 12;
		double yearly_salary2 = test2.get_monthlySalary() * 12;
		
		System.out.println(test1.get_firstName() + " " + test1.get_lastName() + "\t" +  yearly_salary1);
		System.out.println(test2.get_firstName() + " " + test2.get_lastName() + "\t" +  yearly_salary2 + "\n");
		
		double raiseSalary1 = (yearly_salary1 * 0.1) + yearly_salary1;
		double raiseSalary2 = (yearly_salary2 * 0.1) + yearly_salary2;
		
		System.out.println("------Giving 10% raise for each employee------");
		System.out.println(test1.get_firstName() + " " + test1.get_lastName() + "\t" +  raiseSalary1);
		System.out.println(test2.get_firstName() + " " + test2.get_lastName() + "\t" +  raiseSalary2);
		
	}

}
