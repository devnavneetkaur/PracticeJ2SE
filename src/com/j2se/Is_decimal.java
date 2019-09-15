package com.j2se;

import java.util.Scanner;

public class Is_decimal {
	
	
	public static boolean checkDecimal(int number) {
		
		int rem;
		while(number != 0) {
			rem = number % 10;
			number = number / 10;
			if(rem < 0 || rem > 9) {
				return false;
			}
			
		}
		return true;
	
	}

	public static void main(String[] args) {
		
		int num = 0;
		boolean flag;
		Scanner scan = new Scanner(System.in);
		System.out.println("Check number is decimal or not");
		System.out.println("enter number");
		try {
		num = scan.nextInt();
		}catch(Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}
		flag = checkDecimal(num);
		if(flag == false) {
		System.out.println("Number is not decimal " + num);
		}else {
			System.out.println("Number is decimal " + num);
		}
	}

}
