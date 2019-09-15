package com.j2se;

import java.util.Scanner;

public class Is_Hexadecimal2 {

	public static boolean checkHexadecimal(String number) {
		
		String pattern = "^[0-9A-Fa-f]+$";
		if(number.matches(pattern)) {
			return true;
		}
		
		return false;

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
