
package com.j2se.conversion;

import java.util.Scanner;

import com.j2se.Is_Hexadecimal;
import com.j2se.Is_decimal;

public class DecimalToHexadecimal {

	public static void decimalTohexadecimal(int number) {
		
		char rem[] = new char[32];
		int i = 0, temp = 0;
		while(number != 0) {
			 temp = number % 16;
			 if(temp >= 0 && temp <= 9) {
				  rem[i] = (char) (temp + 48);
				  i++;
			 }
			 else if(temp >= 10 && temp <= 15) {
				 rem[i] = (char) (temp + 55);
				  i++; 
			 }
			 
		}
		
		for(int j = i - 1;j >= 0;j--) {
			System.out.println(rem[j]);
		}
		
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("Converting decimal to hexadecimal");
		System.out.println("Enter number");
		try {
			number = scan.nextInt();
			if(number < 0) {
				System.out.println("negative numbers  not allowed");
				return;
			}
			if(!(Is_decimal.checkDecimal(number))){
				System.out.println("Invalid decimal number");
				return;
			}
			
		}catch(Exception e)
		{
			System.out.println("Please enter valid integer");
			return;
		}
		decimalTohexadecimal(number);
		scan.close();
	}

	

}
