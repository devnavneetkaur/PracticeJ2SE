package com.j2se.strings;


import java.util.Scanner;


public class ChangeCase {

	public static String convertToUppercase(String str) {

		int length = 0;
		length = str.length();
		String resultStr = new String();
		String tempStr = str;

		for (int i = 0; i < length; i++) {
			if ((tempStr.charAt(i) >= 'a') && (tempStr.charAt(i) <= 'z')) {
				resultStr = resultStr + (char) (tempStr.charAt(i) - 32);
			} else {
				resultStr = resultStr + tempStr.charAt(i);
			}
		}

		return resultStr;

	}

	public static String convertToLowercase(String str) {
		int length = 0;
		length = str.length();
		String resultStr = new String();
		String tempStr = str;

		for (int i = 0; i < length; i++) {
			if ((tempStr.charAt(i) >= 'A') && (tempStr.charAt(i) <= 'Z')) {
				resultStr = resultStr + (char) (tempStr.charAt(i) + 32);
			} else {
				resultStr = resultStr + tempStr.charAt(i);
			}
		}
		return resultStr;

	}

	public static String toggleCase(String str) {

		int length = 0;
		length = str.length();
		String resultStr = new String();
		String tempStr = str;

		for (int i = 0; i < length; i++) {
			if ((tempStr.charAt(i) >= 'a') && (tempStr.charAt(i) <= 'z')) {
				resultStr = resultStr + (char) (tempStr.charAt(i) - 32);
			} else if ((tempStr.charAt(i) >= 'A') && (tempStr.charAt(i) <= 'Z')) {
				resultStr = resultStr + (char) (tempStr.charAt(i) + 32);
			} else {
				resultStr = resultStr + tempStr.charAt(i);
			}
		}
		return resultStr;

	}
	
	public static boolean noAlphabet(char charAt) {
		
		
		if (((charAt >= 'a') && (charAt <= 'z')) || ((charAt >= 'A') && (charAt <= 'Z')) || ((charAt >= '0') && (charAt <= '9'))) {
			return false;
		} 
		return true ;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null;
		String retStr = null;
		boolean flag = false, retFlag = false;

		do {
			if (flag) {
				System.out.println("Do you want to continue ?");
				str = scan.nextLine();
				if (str.contentEquals("N"))
					break;
			}
			System.out.println("Replace Lower case with Uppercase and vice versa");
			System.out.println("Enter string");
			try {
				str = scan.nextLine();

			} catch (Exception e) {
				System.out.println("Please enter valid input");
				break;
			}

			retStr = convertToUppercase(str);
			System.out.println("String after converting into Uppercase");
			System.out.println(retStr);

			retStr = convertToLowercase(str);
			System.out.println("String after converting into Lowercase");
			System.out.println(retStr);

			retStr = toggleCase(str);
			System.out.println("String after converting into Uppercase to Lowercase and vice-versa");
			System.out.println(retStr);
			
			retFlag = noAlphabet(str.charAt(0));
			System.out.println("" + retFlag);
			
			flag = true;

		} while (true);

		System.out.println("Thank you for using " + new ChangeCase().getClass().getSimpleName() + "app");
			
		scan.close();

	}

	

}
