package com.j2se.number;

import java.util.Scanner;

public class CountOccuranceOfDigit {

	public static void countOccurance(int num) {
		int count = 0, rem = 0, tempNum = 0;
		for (int i = 0; i <= 9; i++) {
			tempNum = num;
			count = 0;
			while (tempNum != 0) {
				rem = tempNum % 10;
				tempNum = tempNum / 10;
				if (rem == i)
					count++;
			}
			if (count != 0)
				System.out.println("The count of " + i + " is " + count);
		}

	}

	public static void countOccuranceUsingSwitch(int number) {

		int rem = 0, tempNum = 0;
		int count[] = new int[10];
		tempNum = number;
		while (tempNum != 0) {

			rem = tempNum % 10;
			tempNum = tempNum / 10;
			switch (rem) {
			case 0:
				count[rem]++;
				break;

			case 1:
				count[rem]++;
				break;
			case 2:
				count[rem]++;
				break;
			case 3:
				count[rem]++;
				break;
			case 4:
				count[rem]++;
				break;
			case 5:
				count[rem]++;
				break;
			case 6:
				count[rem]++;
				break;
			case 7:
				count[rem]++;
				break;
			case 8:
				count[rem]++;
				break;
			case 9:
				count[rem]++;
				break;
			}
		}
		for (int i = 0; i <= 9; i++) {
			if (count[i] != 0)
				System.out.println("The count of " + i + " is " + count[i]);
		}

	}

	public static void main(String[] args) {

		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Count the occurance of digits in number");
		System.out.println("Enter number");
		try {
			number = scan.nextInt();

		} catch (Exception e) {
			System.out.println("Please enter valid number");
			return;
		}
		// countOccurance(number);
		countOccuranceUsingSwitch(number);

	}

}
