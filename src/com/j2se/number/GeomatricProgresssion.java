package com.j2se.number;

import java.util.Scanner;

public class GeomatricProgresssion {

	public static void printGeomatricProgression(int firstTerm, int ratio, int rangeOfSeries) {
		int arr[] = new int[rangeOfSeries];
		int temp = firstTerm;
		for (int i = 1; i <= rangeOfSeries; i++) {

			arr[i - 1] = temp * power(ratio, i - 1);
			System.out.print(arr[i - 1] + "\t");
		}
	}

	public static int power(int ratio, int index) {

		int result = 1;
		for (int i = 0; i < index; i++) {
			result = result * ratio;
		}
		return result;
	}

	public static boolean checkGeomatricProgression(int[] gp) {

		int diff = 0, length = 0;
		length = gp.length;
		diff = gp[1] / gp[0];
		for (int j = 2; j < length; j++) {
			if (diff == (gp[j] / gp[j - 1])) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstTerm = 0, ratio = 0, rangeOfSeries = 0, choice = 0, noOfElement;
		while (true) {
			System.out.println("1 : print Geomatric Progression\n2 : Check Geomatric progression");
			System.out.println("Enter your choice ");

			try {
				choice = scan.nextInt();
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
			if (choice == 1) {
				System.out.println("\nPrint Geomatric progression");
				System.out.println("Enter first term ");
				try {
					firstTerm = scan.nextInt();
					if (firstTerm < 0) {
						System.out.println("Negative numbers not allowed");
						scan.close();
						return;
					}
					System.out.println("Enter ratio");
					ratio = scan.nextInt();
					if (ratio < 0) {
						System.out.println("Negative numbers not allowed");
						scan.close();
						return;
					}
					System.out.println("Enter n to print the series");
					rangeOfSeries = scan.nextInt();
					if (rangeOfSeries <= 0) {
						System.out.println("Negative numbers not allowed");
						scan.close();
						return;
					}
				} catch (Exception e) {
					System.out.println("Please enter valid input");
					scan.close();
					return;
				}
				printGeomatricProgression(firstTerm, ratio, rangeOfSeries);

			} else if (choice == 2) {
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
					scan.close();
					return;
				}
				int gp[] = new int[noOfElement];
				System.out.println("Enter the series");
				for (int index = 0; index < noOfElement; index++) {
					gp[index] = scan.nextInt();
				}
				checkFlag = checkGeomatricProgression(gp);
				if (checkFlag == true) {
					System.out.println("Series is Geomatric progression");
				} else {
					System.out.println("Series is not Geomatric progression");
				}

			} else {
				System.out.println("Wrong choice");
				return;
			}

			System.out.println("\nDo you want to continue Y / N");
			if (scan.next().contentEquals("N"))
				break;
		}
	}
}
