package com.j2se.conversion;

import java.util.Scanner;

import com.j2se.Is_Binary;
import com.j2se.Is_Octal;

public class BinaryToOctal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0,tempnum = 0;
		System.out.println("Convert binary to octal");
		System.out.println("enter number");
		try {
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("Negative numbers not allowed");
				return;
			}
			if(!(Is_Binary.checkBinary(number))) {
				System.out.println("Please enter valid binary number");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid binary number");
			return;
		}
		tempnum = BinaryToDecimal.binaryTodecimal(number);
		System.out.println("Binary to decimal " + tempnum);
		DecimalToOctal.decimalTooctal(tempnum);

	}

}
