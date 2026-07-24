package com.question1;

import java.util.HashMap;
import java.util.Map;

public class ToggleCase {

	public static void main(String[] args) {
		String input = "hExAwAre";
		StringBuilder output = new StringBuilder();
		for (char ch : input.toCharArray()) {

			if (Character.isUpperCase(ch)) {
				output.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				output.append(Character.toUpperCase(ch));
			} else {
				output.append(ch);
			}
		}
		System.out.println("Input: " + input);
		System.out.println("OutPut: " + output);

	}
}