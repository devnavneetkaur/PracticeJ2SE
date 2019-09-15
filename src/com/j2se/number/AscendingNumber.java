package com.j2se.number;

import java.util.Scanner;

public class AscendingNumber {

	public static void ascendingNumber(int number) {
		int rem[] = new int[100];
		int i = 0, length = 0, temp = 0, sumNum = 0;
		while (number != 0) {

			rem[i] = number % 10;
			number = number / 10;
			i++;
		}
		length = i - 1;
		for (int index = 0; index <= length; index++) {
			for (int j = index + 1; j <= length; j++) {
				if (rem[index] < rem[j]) {
					temp = rem[index];
					rem[index] = rem[j];
					rem[j] = temp;
				}
			}
		}
		System.out.print("After conversion in ascending order number is\n");
		for (int k = length; k >= 0; k--) {
			System.out.println(rem[k]);
		}

		for (int index = length; index >= 0; index--) {
			sumNum = sumNum + rem[index] * power(index);
		}
		System.out.println("The number is " + sumNum);
	}

	public static int power(int i) {
		int result = 1;
		for (int m = 1; m <= i; m++) {
			result = result * 10;

		}
		return result;
	}

	/*--------------------------------------------*/

	public static void decendingNumber(int number) {

		int rem[] = new int[100];
		int i = 0, length = 0, temp = 0, sumNumber = 0;
		while (number != 0) {

			rem[i] = number % 10;
			number = number / 10;
			i++;
		}
		length = i - 1;
		for (int index = 0; index <= length; index++) {
			for (int j = index + 1; j <= length; j++) {
				if (rem[index] > rem[j]) {
					temp = rem[index];
					rem[index] = rem[j];
					rem[j] = temp;
				}
			}
		}
		System.out.print("\nAfter conversion in decending order number is\n");
		for (int k = length; k >= 0; k--) {
			System.out.println(rem[k]);
		}
		for (int index1 = length; index1 >= 0; index1--) {
			sumNumber = sumNumber + rem[index1] * power(index1);
		}
		System.out.println("The number is " + sumNumber);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("convert given number in ascending order");
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
		ascendingNumber(number);
		decendingNumber(number);
	}

}
