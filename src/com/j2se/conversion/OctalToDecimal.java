package com.j2se.conversion;

import java.util.Scanner;

import com.j2se.Is_Octal;

public class OctalToDecimal {


	public static int octalTodecimal(int number) {
		int rem = 0, result = 0, powerCount = 0;
		while(number != 0) {
			
			rem = number % 10;
			result = result + rem * power(powerCount);
			number = number / 10;
			powerCount++;
			
		}
		
		return result;
	}
	public  static int power(int powerCount) {
		 int res = 1;
		for(int i = 0; i < powerCount; i++) {
		res  = res * 8;
		
		}
		return res;
	}
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int number = 0, result = 0;
		System.out.println("Converting Octal to Decimal");
		System.out.println("Enter number");
		try {
		number = scan.nextInt();
		if(number < 0) {
			System.out.println("Negitive numbers not allowed");
			return;
		}
		if(!(Is_Octal.checkOctal(number))) {
			System.out.println("Invalid octal number");
			return;
		}
		}catch(Exception e) {
			System.out.println("Please enter valid octal number");
			return;
		}
		result  = octalTodecimal(number);
		System.out.println(result);
		scan.close();

	}


}
