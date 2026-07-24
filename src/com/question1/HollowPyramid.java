package com.question1;

public class HollowPyramid {

	public static void main(String[] args) {
		int numberOfRows = 5;

		for (int rows = 1; rows <= numberOfRows; rows++) {
			for (int col = 1; col <= rows; col++) {

				if (col == 1 || col==rows || rows==numberOfRows) {
					System.out.print(col);

				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}
	}
}