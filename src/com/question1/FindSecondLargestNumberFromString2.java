package com.question1;

import java.util.TreeSet;

public class FindSecondLargestNumberFromString2 {

	public static void main(String[] args) {
		String input = "a1d7c3v9";

		findSecondLargest(input);

	}

	private static void findSecondLargest(String input) {
		char data[] = input.toCharArray();
		TreeSet<Integer> dataSet = new TreeSet<Integer>();
		int num;
		for (char character : data) {
			if (Character.isDigit(character)) {
				num = character - '0';
				dataSet.add(num);
			}
		}
		System.out.println(dataSet);
		dataSet.pollLast();
		System.out.println(dataSet);
		System.out.println(dataSet.last());

	}
}