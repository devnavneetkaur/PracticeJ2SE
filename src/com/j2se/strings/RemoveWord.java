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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null, rmvWord, retStr = null;
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
			System.out.println("String after removing word is " + retStr);
			flag = true;

		} while (true);
	}

}
