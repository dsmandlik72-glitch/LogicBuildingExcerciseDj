package com.question1;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfSpecialCharacter {

	public static void main(String[] args) {

		String input = "abc**&";

		char chArr[] = input.toCharArray();
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();

		for (char ch : chArr) {

			if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
				frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
			}
		}
		System.out.println(frequency);
		
//		String s = "abc#@#";
//
//		char inputArray[] = s.toCharArray();
//
//		HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
//
//		for (char c : inputArray) {
//			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c == ' '))) {
//				if (frequency.containsKey(c)) {
//					frequency.put(c, frequency.get(c) + 1);
//				} else {
//					frequency.put(c, 1);
//				}
//			}
//		}
//		System.out.println(frequency);
	}

}
