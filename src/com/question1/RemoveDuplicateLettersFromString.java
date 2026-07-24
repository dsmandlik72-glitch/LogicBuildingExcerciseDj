package com.question1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {
		String input = "Java";
		Set<Character> linkedHashSet = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		char charArray[] = input.toCharArray();

		for (char tempChar : charArray) {

			if (linkedHashSet.add(tempChar)) {
				sb.append(tempChar);
			}
		}
		System.out.println(sb);
	}

}
