package com.question1;

public class CheckIfNumberIsPalindromeOrNotUsingStringBuilder {

	public static void main(String[] args) {
		int number = 12132;

		// Convert this number to String

		String originalNumberInString = Integer.toString(number);
		String originalNumberInString2 = number + " ";

		// Reverse this String and for that we will use a special class call
		// StringBuilder

		StringBuilder reverseStringBuilder = new StringBuilder(originalNumberInString);
		String reverseString = reverseStringBuilder.reverse().toString();
		System.out.println(reverseStringBuilder.reverse());

		// Compare Two Strings

		if (originalNumberInString.equals(reverseString)) {
			System.out.println("Palidrome!!");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
