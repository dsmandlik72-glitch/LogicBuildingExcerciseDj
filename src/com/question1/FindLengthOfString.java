package com.question1;

public class FindLengthOfString {

	public static void main(String[] args) {
		String data = "hello";

		char characters[] = data.toCharArray();

		int count = 0;

		for (char x : characters) {
			count++;
		}

		System.out.println("Length of String is: " + count);
	}

}
