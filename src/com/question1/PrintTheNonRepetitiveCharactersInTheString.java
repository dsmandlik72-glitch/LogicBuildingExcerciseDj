package com.question1;

import java.util.HashMap;
import java.util.Map;

public class PrintTheNonRepetitiveCharactersInTheString {

	public static void main(String[] args) {
		String input = "Dhananjay is Automation Tester and Dhananjay is UI Tester";

		Map<String, Integer> map = new HashMap<String, Integer>();

		String words[] = input.split(" ");

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		for (String word : words) {
			if (map.get(word) == 1) {
				System.out.println(word);
			}
		}
	}

}
