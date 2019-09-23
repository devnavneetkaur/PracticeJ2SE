package com.j2se.strings;

import java.util.Scanner;

public class Reverse {

	public static String reverse(String str, int len) {

		int length = len;
		String tempStr = str;
		String reverseStr = new String();
		for (int i = length - 1; i >= 0; i--) {
			reverseStr = reverseStr + tempStr.charAt(i);
		}

		return reverseStr;
	}

	public static String reverseRecusion(String str) {
		String retStr = new String();
		try {
			str.charAt(1);

		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("in catch " + str);
			return str;
		}
		
		retStr = retStr + reverseRecusion(Rotate.shiftStr(str, 1));
	                                                                                                                                                                                                                           
		return retStr + str.charAt(0);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null, retStr;
		int len = 0;

		System.out.println("Reverse a String");
		while (true) {

			System.out.println("Enter string");
			str = scan.nextLine();
			len = str.length();
			retStr = reverse(str, len);
			System.out.println(" String after iterative reverse is\t" + retStr);
			retStr = reverseRecusion(str);
			System.out.println(" String after recursive reverse is\t" + retStr);

			System.out.println("\nDo you want to try again Y / N");
			if (scan.next().contentEquals("N"))
				break;

			scan.nextLine();

		}
		scan.close();
	}

}
