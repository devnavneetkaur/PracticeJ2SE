package com.j2se.conversion;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void decimal_to_binary(int num) {
		int rem[] = new int[32];
		int i = 0;
		while(num != 0) {
			rem[i] = num % 2;
			 num = num / 2;
			 i++;
		}
		System.out.println("Deciaml to binary result is :");
		for(int j = i-1; j >= 0; j--) {
			System.out.print(rem[j]);
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("Convert decimal to binary");
		System.out.println("enter number");
		try {
		num = scan.nextInt();
		if (num < 0) {
			System.out.println("Negative number not allowed");
			return;
		}
		}catch(Exception e) {
			System.out.println("Please enter valid integer number");
			return;
		}
		
		decimal_to_binary(num);
	}

	

}
