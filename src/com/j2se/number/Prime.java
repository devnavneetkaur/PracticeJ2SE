package com.j2se.number;

import java.util.Scanner;

public class Prime {
	public static boolean checkPrime(int number) {

		int i = 0;
		boolean flag = false;
		if(number < 2)
			flag = true;
		for (i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}
	/*-----------------------------------------------*/

	public static void check_Prime(int startRange, int endRange) {
		while (startRange <= endRange) {
			int i = 0;
			boolean flag = false;
			
			for (i = 2; i <= startRange / 2; i++) {
				if (startRange % i == 0) {
					flag = true;
				break;
			}
			}
			// System.out.println(Prime numbers :);
			if (flag == false) {
				System.out.println(startRange);
			}
			startRange++;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0, startRange = 0, endRange = 0;
		boolean retflag = false;
		System.out.println("Check a  number is prime or not");
		System.out.println("Enter number");
		try {
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("Negative numbers not allowed");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}
		retflag = checkPrime(number);
		if (retflag == false) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
		

		System.out.println("Enter the starting range and end range");
		startRange = scan.nextInt();
		endRange = scan.nextInt();
		try {
			if ((startRange < 0 || endRange < 0)) {
				System.out.println("negative numbers not allowed");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}
		check_Prime(startRange, endRange);

	}

}
