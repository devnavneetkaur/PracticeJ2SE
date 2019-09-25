package com.j2se.strings;

import java.util.Scanner;

public class Rotate {
	public static String rotateStr(String str, int index) {

		String temp = new String();
		String result = new String();
		int length = 0;

		length = str.length();

		for (int i = 0; i < length; i++) {
			if (i < index) {
				temp = temp + str.charAt(i);
			} else {
				result = result + str.charAt(i);
			}
		}

		return (result + temp);

	}

	public static String shiftStr(String str, int index) {

		String result = new String();
		int length = 0;

		length = str.length();

		for (int i = 0; i < length; i++) {
			if (i < index) {
				continue;
			} else {
				result = result + str.charAt(i);
			}
		}

		return result;

	}

	public static String substring(String str, int index, int endIndex) {

		String result = new String();
		int length = 0;

		length = str.length();
		if (endIndex > length) {
			System.out.println("End index cannot be greater than string length");
			endIndex = length;
		}
		for (int i = 0; i < endIndex; i++) {
			if (i > index - 1) {
				result = result + str.charAt(i);
			} else {
				continue;
			}

		}

		return result;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = null;
		int index = 0, endIndex = 0;
		boolean flag = false;
		String retStr = null;

		do {
			if (flag) {
				System.out.println("Do you want to continue ?");
				str = scan.nextLine();
				if (str.contentEquals("N"))
					break;

			}
			System.out.println("Enter string");
			str = scan.nextLine();

			System.out.println("Enter index");
			index = scan.nextInt();

			System.out.println("Enter end index");
			endIndex = scan.nextInt();

			retStr = rotateStr(str, index);
			System.out.println("After rotating " + retStr);

			retStr = shiftStr(str, index);
			System.out.println("After shifting " + retStr);

			retStr = substring(str, index, endIndex);
			System.out.println("Substring " + retStr);
			scan.nextLine();
			flag = true;
		} while (true);

		scan.close();
	}

}
