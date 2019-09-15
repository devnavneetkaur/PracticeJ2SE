package com.j2se.conversion;

import java.util.Scanner;

import com.j2se.Is_decimal;

public class DecimalToOctal {

	public static void decimalTooctal(int number) {
		
		int rem[] = new int[32];
		int i = 0;
		while(number != 0) {
			rem[i] = number % 8;
			number = number / 8;
			i++;
		}
		System.out.println("Result");
		for(int j = i - 1; j >= 0; j--) {
			System.out.print(rem[j]);
		}

	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("Converting decimal to Octal");
		System.out.println("Enter number");
		try {
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("Negitive numbers not allowed");
				return;
			}
			if (!(Is_decimal.checkDecimal(number))) {
				System.out.println("Invalid decimal number");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid decimal number");
			return;
		}
		
		decimalTooctal(number);
		scan.close();
	}

}
