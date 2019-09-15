package com.j2se;

import java.util.Scanner;

public class Is_Char {

	public static boolean checkIsChar(char input) {
		System.out.println("Entered input " + input);
		if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean result;
		String input;
		System.out.println("Check given input is charater  or not");
		System.out.println("Enter input");
		input = scan.next();
		result = checkIsChar(input.charAt(0));
		if (result == true) {
			System.out.println("Charater ");
		} else {
			System.out.println(" Not a Charater ");
		}
	}

}
