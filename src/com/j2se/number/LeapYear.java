package com.j2se.number;

import java.util.Scanner;

public class LeapYear {
	public static boolean checkLeapYear(int year) {
		boolean flag = false;
		if (year % 400 == 0) {		// Exactly divisible by 400
			flag = true;
		} else if (year % 100 == 0) {	// Exactly divisible by 100 and not by 400
			flag = false;
		} else if (year % 4 == 0) {		// Exactly divisible by 4 and neither by 100 nor 400
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = 0;
		boolean checkFlag = false;
		System.out.println("check leap year");
		System.out.println("Enter year");
		
		try {
			year = scan.nextInt();
			if (year <= 0) {
				System.out.println("Year cannot be less than 0");
				return;
			}

		} catch (Exception e) {
			System.out.println("Please enter valid year");
			return;
		}
		checkFlag = checkLeapYear(year);
		if (checkFlag == true) {
			System.out.println(year + " Leap year");
		} else {
			System.out.println(year + " is not a Leap year");
		}
	}

}
