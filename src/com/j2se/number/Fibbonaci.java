package com.j2se.number;

import java.util.Scanner;

public class Fibbonaci {
	private static void checkFibonacci(int endRange) {

		int a = 0, b = 1;
		int c = 0;
		System.out.println("Printing the fibbonaci series within given range");
		System.out.print(a + " " + b + " ");

		while (c <= endRange) {
			c = a + b;
			if (c > endRange) {
				break;
			}
			System.out.print(c + " ");
			a = b;
			b = c;

		}
		System.out.println("");
	}

	/* -------------------------------------------------- */
	public static void check_Fibbonacci(int endRange) {
		int a = 0, b = 1;
		int c = 0;
		System.out.println("printing the series to given number of range");
		System.out.print(a + " " + b + " ");
		for (int i = 2; i <= endRange; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		System.out.println("");
	}

	/* -------------------------------------------------- */
	public static void checkFib(int firstValue, int secondValue, int endRange) {
		int c = 0;
		System.out.println("Printing the fibbonaci series within given range and based on first and second value");
		System.out.print(firstValue + " " + secondValue + " ");

		while (c <= endRange) {
			c = firstValue + secondValue;
			if (c > endRange) {
				break;
			}
			System.out.print(c + " ");
			firstValue = secondValue;
			secondValue = c;

		}
		System.out.println("");

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int endRange = 0, count = 0, firstValue = 0, secondValue = 0;
		System.out.println("print Fibnonacci series");
		System.out.println("enter the range");
		try {
			endRange = scan.nextInt();
			if (endRange < 0) {
				System.out.println("Negative number not allowed");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}

		checkFibonacci(endRange);
		check_Fibbonacci(endRange);

		System.out.println("Enter the first  and  value");
		try {
			firstValue = scan.nextInt();
			secondValue = scan.nextInt();
			if ((firstValue < 0) || (secondValue < 0)) {
				System.out.println("Negative numbers not allowed");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}

		checkFib(firstValue, secondValue, endRange);
	}

}
