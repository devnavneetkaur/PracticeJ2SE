package com.j2se.conversion;

import java.util.Scanner;

import com.j2se.Is_Octal;

public class OctalToBinary {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0,tempnum = 0;
		System.out.println("Convert octal to binary");
		System.out.println("enter number");
		try {
			num = scan.nextInt();
			if (num < 0) {
				System.out.println("Negative numbers not allowed");
				return;
			}
			if(!(Is_Octal.checkOctal(num))) {
				System.out.println("Please enter valid octal number");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}

		tempnum = OctalToDecimal.octalTodecimal(num);
		System.out.println("octal to decimal " +tempnum);
		DecimalToBinary.decimal_to_binary(tempnum);
	}

}
