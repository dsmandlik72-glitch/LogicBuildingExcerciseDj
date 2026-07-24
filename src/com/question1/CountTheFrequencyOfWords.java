package com.question1;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfWords {

	public static void main(String[] args) {
		String input = "Hello my name is rohan rohan";
		HashMap<String, Integer> result = new HashMap<String, Integer>();

		String inputArray[] = input.split(" ");

		for (String str : inputArray) {

			result.put(str, result.getOrDefault(str, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : result.entrySet()) {

			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}