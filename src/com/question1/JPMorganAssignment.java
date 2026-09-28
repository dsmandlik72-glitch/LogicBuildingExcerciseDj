package com.question1;

import java.util.Arrays;

public class JPMorganAssignment {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 0, 4, 5, 0, 2, 0 };

		int putNonZeroNumberHere = 0;
		int temp = 0;

		for (int current = 0; current < arr.length; current++) {
			if (arr[current] != 0) {

				temp = arr[current];
				arr[current] = arr[putNonZeroNumberHere];
				arr[putNonZeroNumberHere] = temp;
				putNonZeroNumberHere++;
			}
		}
		System.out.println(Arrays.toString(arr));

		// Step 2: Sort only the non-zero numbers
		Arrays.sort(arr, 0, putNonZeroNumberHere);

		System.out.println(Arrays.toString(arr));

	}
}
