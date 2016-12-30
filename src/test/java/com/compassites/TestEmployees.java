package com.compassites;

public class TestEmployees {
	
	public static int numberOfEmployees = 50;
	public static int numberOfContractors = 10;
	
	public static void main(String[] args) {
		int numberOfEmployeesLocal = 100;
		int numberOfContractorsLocal = 200;
		
		/*
		 * Printing Class Variables
		 */
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("## of Employees - Global: " + numberOfEmployees);
		System.out.println("## of Contractors - GLOBAL: " + numberOfContractors);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		/*
		 * Printing Local Variables
		 */
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("No of Employees - Global: " + numberOfEmployeesLocal);
		System.out.println("No of Contractors - Global: " + numberOfContractorsLocal);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
	

}
