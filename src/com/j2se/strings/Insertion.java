package com.j2se.strings;

import java.util.Scanner;

//to do do it with method overloading
public class Insertion {

	public static String insertBegin(String str, String insertStr) {
		String retStr = null;
		retStr = insertStr + str;
		return retStr;
	}

	public static String insertEnd(String str, String insertStr) {
		String retStr = null;
		retStr = str + insertStr;
		return retStr;
	}

	public static String insertWithInrange(String str, String insertStr, int pos) {

		String preStr = null, postStr = null;
		String resultStr = new String();

		preStr = Rotate.substring(str, 0, pos);
		postStr = Rotate.substring(str, pos, str.length());

		resultStr = preStr + insertStr + postStr;
		System.out.println(resultStr);
		return resultStr;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = null, insertStr = null, retStr = null, str1 = null;
		boolean flag = false;
		int pos = 0, choice = 0;

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
			str = scan.nextLine();
			System.out.println("Enter string  you want to insert");
			insertStr = scan.nextLine();
			System.out.println(
					"Enter your choice for insertion \nat begining : Enter 1 \nat end : Enter 2 \nat particular position : Enter 3");
			choice = scan.nextInt();
			switch (choice) {

			case 1:

				retStr = insertBegin(str, insertStr);
				System.out.println("After insertion " + retStr);
				break;

			case 2:

				retStr = insertEnd(str, insertStr);
				System.out.println("After insertion " + retStr);
				break;
			case 3:
				System.out.println("Enter the postion where you want to insert");
				pos = scan.nextInt();
				if (pos == 0) {
					retStr = insertBegin(str, insertStr);
					System.out.println("After insertion " + retStr);
					break;
				} else if (pos == (str.length() - 1)) {
					retStr = insertEnd(str, insertStr);
					System.out.println("After insertion " + retStr);
					break;
				} else if (pos > 0 && (pos < str.length() - 1)) {
					insertWithInrange(str, insertStr, pos);
				} else {
					System.out.println("Please provide a valid postion within range");
					scan.close();
					return;
				}
			}
			flag = true;
			scan.nextLine();
		} while (true);
	}

}
