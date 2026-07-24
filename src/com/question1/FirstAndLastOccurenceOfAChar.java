package com.question1;

public class FirstAndLastOccurenceOfAChar {

	public static void main(String[] args) {

		String input = "HellO WOrld";

		int firstIndex = -1;
		int lastIndex = -1;

		for (int index = 0; index < input.length(); index++) {
			if (Character.toLowerCase(input.charAt(index)) == 'o') {
				firstIndex = index;
				break;
			}
		}

		for (int index = input.length() - 1; index >= 0; index--) {
			if (Character.toLowerCase(input.charAt(index)) == 'o') {
				lastIndex = index;
				break;
			}
		}
		if (firstIndex < 0) {
			System.out.println("Character is not present");
		} else {
			System.out.println("First Index of O is: " + firstIndex);
			System.out.println("Last Index of O is: " + lastIndex);

		}

	}
}
