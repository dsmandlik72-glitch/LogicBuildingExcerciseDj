package com.question1;

public class MountainArrayCheck {

	public static void main(String[] args) {
		// The test array from your screenshot
		int a[] = { 6, 13, 15, 20, 14, 12, 10, 5 };

		System.out.println(mountainArrayCheck(a));
	}

	private static boolean mountainArrayCheck(int[] a) {
		// 1. length of the array must be greater than 2
		if (a.length < 3) {
			return false;
		}

		// 2. Elements must be increasing order!!!
		int i = 0;

		// Climb the mountain
		while (i + 1 < a.length && a[i] < a[i + 1]) {
			i++;
		}

		// Descend the mountain
		while (i + 1 < a.length && a[i] > a[i + 1]) {
			i++;
		}

		// If we reached the end of the array, it's a mountain
		if (a.length - 1 == i) {
			return true;
		} else {
			return false;
		}
	}
}