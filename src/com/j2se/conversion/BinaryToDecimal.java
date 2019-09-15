package com.j2se.conversion;

import java.util.Scanner;

import com.j2se.Is_Binary;

public class BinaryToDecimal {
	public static int binaryTodecimal(int num) {

		int rem = 0, res = 0, count = 0;
		while (num != 0) {
			rem = num % 10;
			res = res + rem * power(count);
			num = num / 10;
			count++;
		}
		return res;
		
	}

	public static int power(int power) {
		int rem = 1;

		for (int i = 0; i < power; i++) {
			rem = rem * 2;
		}
		return rem;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, base = 0, power = 0, result = 0;
		System.out.println("Convert decimal to binary");
		System.out.println("enter number");
		try {
			num = scan.nextInt();
			
			if (!Is_Binary.checkBinary(num)) {
				System.out.println("Invalid Binary Number");
				return;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid binary number");
			return;
		}
	
		result =binaryTodecimal(num);
		System.out.println("Result " + result);
		scan.close();
	}
}
