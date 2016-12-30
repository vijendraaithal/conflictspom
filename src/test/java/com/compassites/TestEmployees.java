package com.compassites;

public class TestEmployees {
	
	public static int numberOfEmployees = 1;
	public static int numberOfContractors = 2 ;
	
	public static void main(String[] args) {
		int numberOfEmployeesLocal = 10;
		int numberOfContractorsLocal = 20;
		
		/*
		 * Printing Class Variables
		 */
		System.out.println("No of Employees - Global: " + numberOfEmployees);
		System.out.println("No of Contractors - Global: " + numberOfContractors);
		
		/*
		 * Printing Local Variables
		 */
		
		System.out.println("No of Employees - Global: " + numberOfEmployeesLocal);
		System.out.println("No of Contractors - Global: " + numberOfContractorsLocal);
	}
	
	

}
