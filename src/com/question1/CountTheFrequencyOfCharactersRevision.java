package com.question1;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfCharactersRevision {

	public static void main(String[] args) {
		String input = "Hello";
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		char dataArray[] = input.toCharArray();

		for (char ch : input.toCharArray()) {
			result.put(ch, result.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}
}