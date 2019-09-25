package com.j2se.number;

import java.util.Scanner;

public class Amstrong {

	public static void checkAmstrong(int number) {

		int sum = 0, rem = 0, tempNum = 0;
		tempNum = number;
		while (tempNum != 0) {
			rem = tempNum % 10;
			sum = sum + rem * rem * rem;
			tempNum = tempNum / 10;
		}
		if (sum == number) {
			System.out.println("Number is Amstrong " + number);
		} else {
			System.out.println("Number is not Amstrong " + number);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("Check an number is Amstrong or not");
		System.out.println("Enter number: ");
		try {
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("Negative number not allowed");
				scan.close();
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");
			scan.close();
			return;
		}
		checkAmstrong(number);
		scan.close();
	}

}
