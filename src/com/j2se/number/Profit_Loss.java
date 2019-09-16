package com.j2se.number;

import java.util.Scanner;

public class Profit_Loss {

	private static float[] checkProfitLoss(float selPrice, float costPrice) {
		float result[] = new float[3];

		result[0] = selPrice - costPrice;
		result[1] = (result[0] / costPrice) * 100;

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float selPrice, costPrice;
		float getResult[] = new float[2];

		while (true) {
			System.out.println("Find Profit, Loss , profit percentage , loss percentage");
			System.out.println("Please Enter the Selling price");
			try {
				selPrice = scan.nextFloat();

				if ((selPrice <= 0)) {
					System.out.println("Please enter valid selling price of product");
					scan.close();
					return;
				}
				System.out.println("Please enter Cost price");
				costPrice = scan.nextFloat();
				if (costPrice <= 0) {
					System.out.println("Please enter valid cost price of product");
					scan.close();
					return;
				}
			} catch (Exception e) {
				System.out.println("please enter valid input");
				scan.close();
				return;
			}
			getResult = checkProfitLoss(selPrice, costPrice);

			System.out.println((getResult[0] == 0) ? ("No Loss No profit")
					: ((getResult[0] > 0) ? ("Profit = " + getResult[0] + "\t Profit % = " + getResult[1])
							: ("Loss = " + -getResult[0] + "\tLoss % = " + -getResult[1])));

			System.out.println("Do you want to continue ? y/n");
			if (scan.next().contentEquals("n"))
				break;
		}
		scan.close();
	}
}
