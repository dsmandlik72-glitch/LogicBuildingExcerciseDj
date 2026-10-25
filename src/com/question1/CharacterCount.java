package com.question1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

//Extract only Digits or Only Letters

public class CharacterCount {

	public static void main(String[] args) {

		String input = "aabbbaccdc";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count each character
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print count followed by character
        StringBuilder output = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            output.append(entry.getValue())
                  .append(entry.getKey());
        }

        System.out.println(output);
    }
}