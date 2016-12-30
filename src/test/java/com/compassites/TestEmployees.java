package com.compassites;

public class TestEmployees {
	
	public static int numberOfEmployees = 5;
	public static int numberOfContractors = 10;
	
	public static void main(String[] args) {
		int numberOfEmployeesLocal = 10;
		int numberOfContractorsLocal = 20;
		
		/*
		 * Printing Class Variables
		 */

		System.out.println("## of Employees - Global: " + numberOfEmployees);
		System.out.println("$$ of Contractors - GLOBAL: " + numberOfContractors);
		
		/*
		 * Printing Local Variables
		 */
		
		System.out.println("No of Employees - Global: " + numberOfEmployeesLocal);
		System.out.println("No of Contractors - Global: " + numberOfContractorsLocal);
	}
	
	

}
