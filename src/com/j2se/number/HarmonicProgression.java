package com.j2se.number;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class HarmonicProgression {

	public static int[] printHarmonicProgression(int firstTerm, int diff, int rangeOfSeries) {
		int arr[] = new int[rangeOfSeries];
		int temp = firstTerm;

		for (int i = 1; i <= rangeOfSeries; i++) {

			arr[i - 1] = temp + (i - 1) * diff;
			System.out.print("1/" + (arr[i - 1]) + "\t");
		}

		return arr;
	}

	public static boolean checkHarmonicProgression(double hp[]) {

		int length = 0;
		double diff = 0;
		diff = hp[1] - hp[0];
		length = hp.length;
		for (int i = 2; i < length; i++) {
			if (diff == (hp[i] - hp[i - 1])) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int firstTerm = 0, diff = 0, rangeOfSeries = 0, choice = 0, noOfElement;

		while (true) {
			System.out.println("1 : print Harmonic Progression\n2 : Check Harmonic progression");
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
			switch (choice) {
			case 1:

				System.out.println("\nPrint Harmonic progression");
				System.out.println("Enter first term ");
				try {
					firstTerm = scan.nextInt();
					if (firstTerm < 0) {
						System.out.println("Negative numbers not allowed");
						scan.close();
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
					if (rangeOfSeries <= 0) {
						System.out.println("Negative numbers not allowed");
						return;
					}
				} catch (Exception e) {
					System.out.println("Please enter valid input");
					return;
				}
				printHarmonicProgression(firstTerm, diff, rangeOfSeries);
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
				double hp[] = new double[noOfElement];
				System.out.println("Enter the series");
				for (int index = 0; index < noOfElement; index++) {
					hp[index] = scan.nextInt();
				}
				checkFlag = checkHarmonicProgression(hp);
				if (checkFlag == true) {
					System.out.println("Series is Harmonic progression");
				} else {
					System.out.println("Series is not Harmonic progression");
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
