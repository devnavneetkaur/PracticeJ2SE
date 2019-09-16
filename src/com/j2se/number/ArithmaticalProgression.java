package com.j2se.number;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class ArithmaticalProgression {

	public static int[] printArithmaticProgression(int firstTerm, int diff, int rangeOfSeries) {
		int arr[] = new int[rangeOfSeries];
		int temp = firstTerm;

		for (int i = 1; i <= rangeOfSeries; i++) {

			arr[i - 1] = temp + (i - 1) * diff;
			System.out.print(arr[i - 1] + "\t");
		}

		return arr;
	}

	public static boolean checkArithmaticProgression(int ap[]) {

		int length = 0, diff = 0;

		diff = ap[1] - ap[0];
		length = ap.length;
		for (int i = 2; i < length; i++) {
			if (diff == (ap[i] - ap[i - 1])) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int firstTerm = 0, diff = 0, rangeOfSeries = 0, choice = 0, noOfElement;

		while (true) {
			System.out.println("1 : print Arithmatic Progression\n2 : Check Arithmatic progression");
			System.out.println("Enter your choice ");
			choice = scan.nextInt();
			try {
				if (choice < 0) {
					System.out.println("Please enter positive value for choice");
					scan.close();
					return;
				}
			} catch (Exception e) {
				System.out.println("Please enter valid choice");
				scan.close();
				return;
			}
			switch (choice) {
			case 1:

				System.out.println("\nPrint Arithmatic progression");
				System.out.println("Enter first term ");
				try {
					firstTerm = scan.nextInt();
					if (firstTerm < 0) {
						System.out.println("Negative numbers not allowed");
						return;
					}
					System.out.println("Enter difference");
					diff = scan.nextInt();
					if (diff < 0) {
						System.out.println("Negative numbers not allowed");
						return;
					}
					System.out.println("Enter n to print the series");
					rangeOfSeries = scan.nextInt();
				} catch (Exception e) {
					System.out.println("Please enter valid input");
					return;
				}
				printArithmaticProgression(firstTerm, diff, rangeOfSeries);
				break;

			case 2:
				System.out.println("Enter the range of series");
				noOfElement = scan.nextInt();
				boolean checkFlag = false;
				try {
					if (noOfElement <= 0) {
						System.out.println("Element should be greater than 0");
						scan.close();
						return;

					}
				} catch (Exception e) {
					System.out.println("Please enter valid input");
					scan.close();
					return;
				}
				
				if (noOfElement < 3) {
					System.out.println("Please enter atleast 3 elements in series");
					return;
				}
				int ap[] = new int[noOfElement];
				System.out.println("Enter the series");
				for (int index = 0; index < noOfElement; index++) {
					ap[index] = scan.nextInt();
				}
				checkFlag = checkArithmaticProgression(ap);
				if (checkFlag == true) {
					System.out.println("Series is Arithmatic progression");
				} else {
					System.out.println("Series is not Arithmatic progression");
				}

				break;

			default:
				System.out.println("Wrong choice");
				break;
			}
			System.out.println("\nDo you want to try again Y / N");
			if (scan.next().contentEquals("N"))
				break;
		}
	}

}
