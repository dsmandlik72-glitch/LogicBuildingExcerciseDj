package com.question1;

import java.util.Scanner;

public class CoforgeAssignmentOfArray {

	public static void main(String[] args) {
		int arr[][] = new int[3][4];
		Scanner scanner = new Scanner(System.in);
		// System.out.println(arr.length);
		int rowCount = 0;
		int colCount = 0;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.println("Enter Digit for the Index:");
				arr[row][col] = scanner.nextInt();
				colCount++;
			}
			rowCount++;
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.println("Element at Index:" + arr[row][col]);
			}
		}
		System.out.println("Total Number of rows are: " + arr.length);
		System.out.println("Total Number of columns are: " + arr[0].length);

	}
}
