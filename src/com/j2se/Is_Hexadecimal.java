package com.j2se;

import java.util.Scanner;

public class Is_Hexadecimal {

	public static boolean checkHexadecimal(String number) {

		int length = number.length();
		for (int i = 0; i < length; i++) {
			if (!((number.charAt(i) >= '0' && number.charAt(i) <= '9')
					|| (number.charAt(i) >= 'A' && number.charAt(i) <= 'F')
					|| (number.charAt(i) >= 'a' && number.charAt(i) <= 'f'))) {
				return false;
				
			}
			
		}
		return true;

	}

	public static void main(String[] args) {

		String num = null;
		boolean flag;
		Scanner scan = new Scanner(System.in);
		System.out.println("Check number is Hexadeciaml or not");
		System.out.println("enter number");
		try {
			num = scan.next();
		} catch (Exception e) {
			System.out.println("Please enter valid number");
			return;
		}
		flag = checkHexadecimal(num);
		if (flag == false) {
			System.out.println("Number is not Hexadecimal " + num);
		} else {
			System.out.println("Number is Hexadecimal " + num);
		}
	}

}
