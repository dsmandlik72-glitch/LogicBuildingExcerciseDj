package com.question1;

public class CheckIfTwoStringAreAnagram {

	public static void main(String[] args) {
		String str1 = "Keep";
		String str2 = "Peek";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			// Array to store frequencies of 26 English alphabets
			int[] charCounts = new int[26];
			boolean isAnagram = true;

			for (int i = 0; i < str1.length(); i++) {
				// Map character to index 0-25 (e.g., 'a' - 'a' = 0, 'b' - 'a' = 1)
				charCounts[str1.charAt(i) - 'a']++;
				charCounts[str2.charAt(i) - 'a']--;
			}

			// If it's an anagram, all counts must be exactly 0
			for (int count : charCounts) {
				if (count != 0) {
					isAnagram = false;
					break;
				}
			}

			if (isAnagram) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("Nope");
			}

		} else {
			// Side note: A "Pangram" contains all 26 letters, but fixed the output text
			// logic flow
			System.out.println("String is not Anagram");
		}
	}
}
