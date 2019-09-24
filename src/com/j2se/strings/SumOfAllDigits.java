package com.j2se.strings;

import java.util.Scanner;

public class SumOfAllDigits {

	public static int sumOfAllDigits(String str) {
		int number = 0, result = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				number = str.charAt(i) - 48;
				result = result + number;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null;
		boolean flag = false;
		int sum = 0;

		do {

			if (flag) {
				System.out.println("Do you want to continue ?");
				str = scan.nextLine();
				if (str.contentEquals("N"))
					break;
			}
			System.out.println("Enter string");
			str = scan.nextLine();
			sum = sumOfAllDigits(str);
			System.out.println("Sum of all digits of number in string is " + sum);
			flag = true;
		} while (true);

	}

}