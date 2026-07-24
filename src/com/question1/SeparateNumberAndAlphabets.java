package com.question1;

public class SeparateNumberAndAlphabets {

	public static void main(String[] args) {

		String input = "Ra123j";

		StringBuffer numbers = new StringBuffer();
		StringBuffer alphabets = new StringBuffer();

		for (char currentChar : input.toCharArray()) {

			if (Character.isDigit(currentChar)) {
				numbers.append(currentChar);
			} else if (Character.isAlphabetic(currentChar)) {
				alphabets.append(currentChar);
			} else {
				System.out.println("This is not a Character or Not Number");
			}
		}
		System.out.println(numbers.toString());
		System.out.println(alphabets.toString());

	}

}
