package com.j2se.strings;

import java.util.Scanner;

import com.j2se.number.AscendingNumber;

public class Anagram {

	public static boolean checkAnagram(String str1, String str2) {
		

		if (str1.length() != str2.length()) {
			System.out.println("the length of both the strings are different");
			return false;
		}
		
		boolean resultFlag = false;

		String temp1 = new String();
		String temp2 = new String();

		str1 = ChangeCase.convertToLowercase(str1);
		str2 = ChangeCase.convertToLowercase(str2);

		char strArr1[] = new char[str1.length()];
		char strArr2[] = new char[str2.length()];
		char resultStr1[] = new char[str1.length()];
		char resultStr2[] = new char[str1.length()];

		for (int index = 0; index < strArr1.length; index++) {

			strArr1[index] = str1.charAt(index);
			strArr2[index] = str2.charAt(index);

		}

		resultStr1 = (AscendingNumber.sortStr(strArr1));
		resultStr2 = (AscendingNumber.sortStr(strArr2));

		for (int index1 = 0; index1 < resultStr1.length; index1++) {
			temp1 = temp1 + resultStr1[index1];
			temp2 = temp2 + resultStr2[index1];
		}

		if (temp1.equals(temp2)) {

			return (resultFlag = true);
		}

		return resultFlag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = null, str2 = null;
		boolean flag = false, retFlag = false;

		do {
			if (flag) {
				System.out.println("Do you want to continue ?");
				str1 = scan.nextLine();
				if (str1.contentEquals("N")) {
					scan.close();
					break;
				}
			}
			System.out.println("Enter first string");
			str1 = scan.nextLine();
			System.out.println("Enter second string");
			str2 = scan.nextLine();

			retFlag = checkAnagram(str1, str2);
			if (retFlag == true)
				System.out.println("Strings are anagram");
			else {
				System.out.println("Strings are not anagram");
			}
			flag = true;
		} while (true);

	}

}
