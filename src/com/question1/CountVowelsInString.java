package com.question1;

public class CountVowelsInString {

	public static void main(String[] args) {
		String input = "AEHello World";

		String vowelSet = "aeiouAEIOU";

		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			if (vowelSet.indexOf(input.charAt(index)) != -1) {
				System.out.println(input.charAt(index));
				count++;
			}
		}
		System.out.println("Count of vowel in a string is: " + count);
	}

}
