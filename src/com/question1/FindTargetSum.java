package com.question1;

public class FindTargetSum {

	public static void main(String[] args) {

		int[] arr = { 5, 12, 7, 10, 8, 9 };
		int target = 17;

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					System.out.println("Indices are: " + i + " and " + j);
					found = true;
				}
			}
		}

		if (!found) {
			System.out.println("No pair found.");
		}
	}
}