package com.question1;

public class JavaPrac {

	public static void main(String[] args) {

		int num = 1;

		// Upper Part
		for (int i = 1; i <= 4; i++) {

			for (int s = 4; s >= i; s--)
				System.out.print("  ");

			for (int j = 1; j <= i; j++)
				System.out.print(num++ + "   ");

			System.out.println();
		}

		// Lower Part
		for (int i = 3; i >= 1; i--) {

			for (int s = 3; s >= i; s--)
				System.out.print("  ");

			for (int j = 1; j <= i; j++)
				System.out.print(num++ + "   ");

			System.out.println();
		}
	}

}