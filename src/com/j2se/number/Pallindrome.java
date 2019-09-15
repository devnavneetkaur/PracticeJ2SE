package com.j2se.number;

import java.util.Scanner;

public class Pallindrome {

	public static void checkPallindrome(int number) {

		int reverse = 0, rem = 0, tempNum = 0;
		tempNum = number;
		while (tempNum != 0) {
			rem = tempNum % 10;
			reverse = reverse * 10 + rem;
			tempNum = tempNum / 10;
		}
		if (reverse == number) {
			System.out.println("Number is pallindrome " + number);
		} else {
			System.out.println("Number is not pallindrome " + number);
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("Check an number is Pallindrome or not");
		System.out.println("Enter number: ");
		try {
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("Negative number not allowed");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}
		checkPallindrome(number);
	}

}
