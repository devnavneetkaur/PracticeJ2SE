package com.j2se.strings;

import java.util.Scanner;

public class RemoveWord {

	public static String removeWord(String str, String rmvWord) {

		String result = new String();
		int tempIndex = 0, i = 0, j = 0;

		for (i = 0; i < str.length(); i++) {
			tempIndex = i;

			for (j = 0; j < rmvWord.length(); j++) {

				if (rmvWord.charAt(j) == str.charAt(tempIndex)) {
					tempIndex++;
				} else {

					result = result + str.charAt(i);
					break;

				}
			}
			if (j == rmvWord.length()) {
				i = i + j - 1;
			}
		}
		return result;

	}

	public static String removeWordStr(String str, String rmvWord) {
		String result = new String();
		int tempIndex = 0, i = 0, j = 0;

		for (i = 0; i < str.length(); i++) {
			tempIndex = i;

			for (j = 0; j < rmvWord.length(); j++) {

				if (rmvWord.charAt(j) == str.charAt(tempIndex)) {
					tempIndex++;
				} else {

					result = result + str.charAt(i);
					break;

				}
			}
			if (j == rmvWord.length()) {
				if (i <= 0) {
					if (tempIndex >= str.length()) {
						i = i + j - 1;
					} else {
						if (ChangeCase.noAlphabet(str.charAt(tempIndex))) {
							i = i + j - 1;
						}
					}
				} else if (tempIndex >= str.length()) {
					if (ChangeCase.noAlphabet(str.charAt(i - 1))) {
						i = i + j - 1;
					} else {
						result = result + str.charAt(i);
					}

				} else {
					if (ChangeCase.noAlphabet(str.charAt(i - 1)) && ChangeCase.noAlphabet(str.charAt(tempIndex))) {
						i = i + j - 1;
					} else {
						result = result + str.charAt(i);
					}
				}
			}

		}
		return result;

	}

	private static int frequencyOfSubStr(String str, String rmvWord) {

		int tempIndex = 0, i = 0, j = 0, count = 0;
		String result = new String();

		for (i = 0; i < str.length(); i++) {
			tempIndex = i;

			for (j = 0; j < rmvWord.length(); j++) {

				if (rmvWord.charAt(j) == str.charAt(tempIndex)) {

					tempIndex++;

				} else {

					break;
				}

			}
			if (j == rmvWord.length()) {
				++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null, rmvWord, retStr = null;
		int retCount = 0;
		boolean flag = false;
		System.out.println("Remove given Word from a String");
		do {
			if (flag) {
				System.out.println("\nDo you want to try again Y / N");
				if (scan.nextLine().contentEquals("N"))
					break;
			}
			System.out.println("Enter string");
			try {
				str = scan.nextLine();
				System.out.println("Enter the word you want to remove");
				rmvWord = scan.nextLine();

			} catch (Exception e) {
				System.out.println("Please enter valid input");
				scan.close();
				break;
			}
			retStr = removeWord(str, rmvWord);
			System.out.println("String after removing substring word is " + retStr);
			
			retStr = removeWordStr(str, rmvWord);
			System.out.println("String after removing is " + retStr);

			retCount = frequencyOfSubStr(str, rmvWord);
			System.out.println("freuency of substring in string is " + retCount);
			flag = true;

		} while (true);
	}

}
