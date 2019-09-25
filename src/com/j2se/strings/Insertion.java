package com.j2se.strings;

import java.util.Scanner;

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
		
		int finalLen = 0;
	String preStr = new String();
		String postStr = null;
		finalLen = str.length() + insertStr.length();
		
		for(int i = 0; i <= pos; i++) {
		
		}
		return null;
	}


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = null, insertStr = null, retStr = null;
		boolean flag = false;
		int pos = 0, choice = 0;

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
				if (pos == 0 || pos < str.length()) {
					retStr = insertWithInrange(str, insertStr, pos);
				}

			}

			flag = true;
		} while (true);
	}


}
