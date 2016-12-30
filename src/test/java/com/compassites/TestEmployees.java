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
		System.out.println("No of Emp - Global: " + numberOfEmployees);
		System.out.println("No of Emp - Global: " + numberOfContractors);
		
		/*
		 * Printing Local Variables
		 */
		
		System.out.println("No of Emp - Global: " + numberOfEmployeesLocal);
		System.out.println("No of Emp - Global: " + numberOfContractorsLocal);
	}
	
	

}
