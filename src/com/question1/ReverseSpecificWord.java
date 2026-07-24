package com.question1;

public class ReverseSpecificWord {

	public static void main(String[] args) {
		String input = "Hello From Java World"; // "World" is now at the end, but the code will still find it
		
		reverseTargetWord(input, "World");
	}

	private static void reverseTargetWord(String input, String targetWord) {
		
		if (input == null || input.isEmpty()) {
			System.out.println("Can not reverse the string");
			return;
		}
		
		// 1. Split the string into individual words
		String words[] = input.split(" ");
		boolean wordFound = false;

		// 2. Loop through the array to find where "World" is located
		for (int i = 0; i < words.length; i++) {
			
			// Use equalsIgnoreCase to find the word regardless of capitalization
			if (words[i].equalsIgnoreCase(targetWord)) {
				wordFound = true;
				
				// 3. Convert the found word to a char array and reverse it
				char charArray[] = words[i].toCharArray();
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
				
				// 4. Replace the original word with the reversed one
				words[i] = new String(charArray);
				
				// Optional: break; if you only want to reverse the first occurrence of "World"
			}
		}
		
		if (!wordFound) {
			System.out.println("Target word '" + targetWord + "' not found in the string.");
			System.out.println(input);
			return;
		}
		
		// 5. Reconstruct the final sentence
		String result = String.join(" ", words);
		
		System.out.println("Original String: " + input);
		System.out.println("Result String:   " + result);
	}
}
