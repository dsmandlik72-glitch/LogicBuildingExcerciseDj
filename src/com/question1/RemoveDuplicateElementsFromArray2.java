package com.question1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray2 {

	public static void main(String[] args) {
		int a[] = { 20, 10, 30, 20, 10, 40 };
		System.out.println("Original Array is: " + Arrays.toString(a));
		a = Arrays.stream(a).distinct().toArray();
		System.out.println("New Distinct Array is: " + Arrays.toString(a));

	}

}
