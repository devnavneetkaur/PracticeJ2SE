package com.j2se.number;

import java.util.Scanner;

public class FactorialRecursion {
	
	private static int factorial(int number) {
		 int fact = 0;
	 if(number == 0 || number == 1) {
		 fact = 1;
	 }else {
		 
		 fact = number * factorial(number - 1);
		
		
	 }
	 return fact; 
			
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = 0, result = 0;
		System.out.println("factorial of a number");
		System.out.println("Enter number");
		try {
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("Negative numbers are not allowed");
				return;
			}

		} catch (Exception e) {
			System.out.println("Please enter valid number");
			return;
		}
		result  = factorial(number);
		System.out.println(result);
	}

	
	
	

}
