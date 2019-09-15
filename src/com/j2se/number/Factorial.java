package com.j2se.number;

import java.util.Scanner;

public class Factorial {
	
	private static void factorial(int number) {
	 int fact = 1;
		for(int i = 1; i <= number; i++) {
			
			fact = fact * i;
		}
		System.out.println("factorail of " + number + " is " + fact);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
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
		factorial(number);
	}

	
	
	

}
