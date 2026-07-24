package com.question1;

public class ReverseLastWordOfString {

	public static void main(String[] args) {
		String input = "Hello World From Java"; // "Java" is the last word and will be reversed
		
		reverseLastWord(input);
	}

	private static void reverseLastWord(String input) {
		
		if (input == null || input.isEmpty()) {
			System.out.println("Can not reverse the string");
			return;
		}
		
		// 1. Split the string into all individual words
		String words[] = input.split(" ");
		
		// 2. Identify the dynamic index of the last word
		int lastWordIndex = words.length - 1;
		
		// 3. Convert the last word to a char array
		char charArray[] = words[lastWordIndex].toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		
		// Your existing swap logic
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		
		// 4. Put the reversed last word back into the array
		words[lastWordIndex] = new String(charArray);
		
		// 5. Reconstruct the final sentence
		String result = String.join(" ", words);
		
		System.out.println("Original String: " + input);
		System.out.println("Result String:   " + result);
	}
}

