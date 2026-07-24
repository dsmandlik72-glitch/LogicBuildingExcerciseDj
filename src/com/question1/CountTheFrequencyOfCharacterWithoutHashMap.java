package com.question1;

public class CountTheFrequencyOfCharacterWithoutHashMap {

	public static void main(String[] args) {
		String input = "abccaa";// a 3 , b 1, c 2

		int frequency[] = new int[256];

		char inputArray[] = input.toCharArray();

		for (char currentChar : inputArray) {

			frequency[currentChar] = frequency[currentChar] + 1;

		}

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) i + " " + frequency[i]);
			}
		}

	}

}
