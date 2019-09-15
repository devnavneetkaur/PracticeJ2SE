package com.j2se.conversion;

import java.util.Scanner;

import com.j2se.Is_Hexadecimal;
import com.j2se.Is_decimal;

public class HexadecimalToDecimal {

	private static void hexadecimalToadecimal(String number) {
		int len = number.length();
		System.out.println("Length " +len);
		char rem;
		int result = 0;
		for (int i = 0; i < len; i++) {
			rem = number.charAt(i);
			System.out.println("rem" +rem);
			if (rem >= '0' && rem <= '9') {
				rem = (char) (rem - 48);
				System.out.println("Rem " +rem);
				result = result + rem * power(i);
				i++;
			}else if((rem >= 'A' && rem <= 'F')) {
				rem = (char) (rem - 55);
				result = result + rem * power(i);
				i++;
			}
			System.out.println("Result ");
			for(int k = i - 1; k >= 0; k--) {
			System.out.println(result);
			}
		}
		
	}

	public static int power(int i) {
		int res = 1;
		for (int j = 0; j < i; j++) {
			res = res * 16;
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = null;
		System.out.println("Converting Hexadecimal to decimal");
		System.out.println("Enter number");
		try {
			number = scan.next();

			if (!(Is_Hexadecimal.checkHexadecimal(number))) {
				System.out.println("Invalid hexadecimal number");
				return;
			}

		} catch (Exception e) {
			System.out.println("Please enter valid Hexadecimal number");
			return;
		}
		hexadecimalToadecimal(number);
		scan.close();
	}

}
