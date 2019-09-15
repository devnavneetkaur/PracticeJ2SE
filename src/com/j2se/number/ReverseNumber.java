package com.j2se.number;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int i = 0;
		int rem[] = new int[100];
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("converting a number into its reverse");
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

			rem[i] = number % 10;
			number = number / 10;
			i++;

		}
		for (int j = 0; j <= i - 1; j++) {
			System.out.print(rem[j]);
		}
	}

}
