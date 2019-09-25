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

	/*--------------------------------------------*/

	public static char[] sortStr(char[] str) {

		char temp;
		char result[] = new char[str.length];

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i] > str[j]) {

					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}

		}
		for (int i = 0; i < str.length; i++) {
			result[i] = str[i];

		}
		return result;
	}
	/*---------------------------------------------*/

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = 0;
		String str = null;

		System.out.println("convert given number in ascending order");
		System.out.println("Enter number");
		try {
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("Negative numbers are not allowed");
				scan.close();
				return;
			}

		} catch (Exception e) {
			System.out.println("Please enter valid number");
			scan.close();

			return;
		}
		ascendingNumber(number);
		decendingNumber(number);

		System.out.println("Enter the string you want to sort");
		str = scan.next();
		char strArr[] = new char[str.length()];
		char retStr[] = new char[str.length()];

		for (int index = 0; index < str.length(); index++) {

			strArr[index] = str.charAt(index);

		}

		System.out.println("After sorting string is ");
		for (int index1 = 0; index1 < retStr.length; index1++)
			System.out.print(retStr[index1]);

		scan.close();
	}

}
