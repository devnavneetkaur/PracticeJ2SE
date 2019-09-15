package com.j2se;

import java.util.Scanner;

public class Is_Octal {

	public static boolean checkOctal(int number) {
		
		int rem;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			if (rem >= 0 && rem <= 7) {
				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {

		int num = 0;
		boolean flag;
		Scanner scan = new Scanner(System.in);
		System.out.println("Check number is Octal or not");
		System.out.println("enter number");
		try {
			num = scan.nextInt();
			if(num < 0) {
				System.out.println("negitive number not allowed");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}
		flag = checkOctal(num);
		if (flag == false) {
			System.out.println("Number is not Octal " + num);
		} else {
			System.out.println("Number is Octal " + num);
		}
	}

}
