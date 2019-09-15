package com.j2se.number;

import java.util.Scanner;

public class SumOfAllDigits {

	public static void main(String[] args) {
		int rem = 0, sum = 0;
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("calculating the sum of all digits of a number");
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
		while (number != 0) {

			rem = number % 10;
			sum = sum + rem;
			number = number / 10;

		}
		System.out.println("Sum of all digits of a number is " + sum);
	}

}
