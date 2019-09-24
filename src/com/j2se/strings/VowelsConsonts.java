package com.j2se.strings;

import java.util.Scanner;

public class VowelsConsonts {

	public static int[] Count(String str) {
		int vowelCount = 0, consonantCount = 0;
		int result[] = new int[2];

		ChangeCase.convertToLowercase(str);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				result[0] = ++vowelCount;

			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

				result[1] = ++consonantCount;

			}
		}
		return result;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = null;
		boolean flag = false;
		int retStr[] = new int[2];

		do {
			if (flag) {
				System.out.println("Do you want to continue ?");
				str = scan.nextLine();
				if (str.contentEquals("N"))
					break;
			}
			System.out.println("Enter string");
			str = scan.nextLine();
			retStr = Count(str);
			System.out.println("Vowels " + retStr[0] + "\tConsonants " + retStr[1]);
			flag = true;
		} while (true);
	}

}
