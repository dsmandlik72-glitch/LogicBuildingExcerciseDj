package com.question1;

public class Pangram {

	public static void main(String[] args) {

		String input = "he quick brown fox jumps over the lzy dog";

		input = input.toLowerCase();
		System.out.println(input);

		boolean result = checKPangram(input);
		if (result) {
			System.out.println("The String is Pangram");
		} else {
			System.out.println("The String is not Pangram");
		}
	}

	private static boolean checKPangram(String input) {
		if (input.length() < 26) {
			return false;
		}

		for (char i = 'a'; i <= 'z'; i++) {
			if (input.indexOf(i) < 0) {
				return false;
			}
		}
		return true;
	}

}
