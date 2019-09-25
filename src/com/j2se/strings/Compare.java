package com.j2se.strings;

import java.util.Scanner;

public class Compare {
	private static boolean checkEqual(String str1, String str2) {

		boolean resultFlag = false;

		if (str1.length() != str2.length()) {
			System.out.println("Strings length is not equal");
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) != str2.charAt(i)) {

				return resultFlag;

			} else {
				continue;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = null, str2 = null, str = null;
		boolean flag = false, retFlag = false;

		do {
			if (flag) {
				System.out.println("Do you want to continue ?");
				str = scan.nextLine();

				if (str.contentEquals("N")) {
					scan.close();
					break;
				}
			}
			System.out.println("Enter first string");
			str1 = scan.nextLine();
			System.out.println("Enter second string");
			str2 = scan.nextLine();

			retFlag = checkEqual(str1, str2);
			if (retFlag == true)
				System.out.println("Strings are equal");
			else {
				System.out.println("Strings are not equal");
			}

			flag = true;
		} while (true);
	}

}
