package com.j2se.number;

import java.util.Scanner;

public class Hcf_Lcm {

	public static int calculateHCF(int num1, int num2) {

		int a = 0, b = 0, temp = 0;
		a = num1;
		b = num2;
		while (a != 0) {
			temp = a;
			a = b % a;
			b = temp;

		}
		return b;

	}

	public static int calculateLCM(int number1, int number2) {

		int resLCM = 0, resHCF = 0, product = 0;
		product = (number1 * number2);

		resHCF = (Hcf_Lcm.calculateHCF(number1, number2));
		resLCM = product / resHCF;

		return resLCM;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (true) {
			System.out.println("1 : Check HCF\n2 : Check LCM");
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
				int num1 = 0, num2 = 0, resultHCF = 0;
				System.out.println("Enter two numbers");

				try {

					num1 = scan.nextInt();
					num2 = scan.nextInt();
					if ((num1 <= 0) || (num2 < 0)) {
						System.out.println("Please enter positive value");
						scan.close();
						return;

					}
				} catch (Exception e) {
					System.out.println("Please enter valid input");
					scan.close();
					return;
				}
				resultHCF = calculateHCF(num1, num2);
				System.out.println("HCF of " + num1 + "," + num2 + " is " + resultHCF);
				break;

			case 2:
				int number1 = 0, number2 = 0, resultLCM = 0;
				System.out.println("Enter two numbers");

				try {

					number1 = scan.nextInt();
					number2 = scan.nextInt();
					if ((number1 <= 0) || (number2 < 0)) {
						System.out.println("Please enter positive value");
						scan.close();
						return;

					}
				} catch (Exception e) {
					System.out.println("Please enter valid input");
					scan.close();
					return;
				}
				resultLCM = calculateLCM(number1, number2);
				System.out.println("LCM of " + number1 + "," + number2 + " is " + resultLCM);
				break;
			default:
				System.out.println("Wrong choice");
				break;

			}
			System.out.println("Do you want to continue Y / N");
			if (scan.next().contentEquals("N"))
				break;

		}
	}
}
