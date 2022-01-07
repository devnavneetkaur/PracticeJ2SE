package com.j2se;

import java.util.Scanner;

public class Is_Binary {

	public static boolean checkBinary(int number) {

		int rem;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			if (rem >= 0 && rem <= 1) {
				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {

		int num = 0;
		boolean flag;
		Scanner scan = new Scanner(System.in);
		System.out.println("Check number is Binary or not");
		System.out.println("enter number");
		try {
			num = scan.nextInt();
			if (num < 0) {
				System.out.println("Negative numbers not allowed");
				return;
			} else if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
				System.out.println("No out of range min " + Integer.MIN_VALUE + "max " + Integer.MAX_VALUE);
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");

			return;
		}
		flag = checkBinary(num);
		if (flag == false) {
			System.out.println("Number is not Binary " + num);
		} else {
			System.out.println("Number is Binary  " + num);
		}
	}

}
