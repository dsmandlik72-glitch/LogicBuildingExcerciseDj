package com.question1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40, 40, 10 };

		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		Integer i = new Integer(20);
		i.intValue();

		for (int data : input) {

			dataSet.add(data);

		}
		System.out.println("Unique Elements are:" + dataSet);

		int result[] = dataSet.stream().mapToInt(Integer::intValue).toArray();

		System.out.println("The Unique Elements in the Array are: " + Arrays.toString(result));

	}

}
