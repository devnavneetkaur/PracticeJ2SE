package com.j2se.strings;

import java.util.Scanner;

public class SplitString {

	public static String[] splitString(String str, String delimiter) {
		String[] retStrArr = null;
		int nSubStr = 0;
		int index1 = 0;
		int index2 = 0;
		int count = 0, prevCount = 0;

		for (index1 = 0; index1 < delimiter.length(); index1++) {
			for (index2 = 0; index2 < str.length(); index2++) {
				if (delimiter.charAt(index1) == str.charAt(index2))
					nSubStr++;
			}
		}

		retStrArr = new String[nSubStr + 1];

		for (index1 = 0; index1 < delimiter.length(); index1++) {
			count = 0;
			for (index2 = 0; index2 < str.length(); index2++) {

				if (delimiter.charAt(index1) == str.charAt(index2)) {

					retStrArr[index2 - count - prevCount] = Rotate.substring(str, index2 - count, index2);
					System.out.println(retStrArr[index2 - count - prevCount]);
					prevCount += count;
					count = 0;
				} else {
					count++;

				}
			}
		}
		if ((index2 == str.length()) && (index1 == delimiter.length()) && (retStrArr[retStrArr.length - 1] == null)) {
			retStrArr[index2 - count - prevCount] = Rotate.substring(str, index2 - count, index2);
			System.out.println(retStrArr[index2 - count - prevCount]);
		}
		return retStrArr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null, delimiter = null;
		String[] retStr = null;
		boolean flag = false;

		do {
			if (flag) {
				System.out.println("Do you want to continue ?");
				str = scan.nextLine();
				if (str.contentEquals("N")) {
					scan.close();
					break;
				}

			}
			System.out.println("Enter string");
			str = scan.nextLine();
			System.out.println("Enter the delimiter");
			delimiter = scan.next();
			retStr = splitString(str, delimiter);

		} while (true);
	}

}
