package com.question1;

public class StringReversePreservingWhiteSpace {

	public static String reversePreservingWhitespace(String input) {
        if (input == null) {
            return null;
        }

        char[] resultArray = input.toCharArray();
        int left = 0;
        int right = resultArray.length - 1;

        // Use two pointers to swap characters from outside in
        while (left < right) {
            // Skip spaces from the left side
            if (Character.isWhitespace(resultArray[left])) {
                left++;
            } 
            // Skip spaces from the right side
            else if (Character.isWhitespace(resultArray[right])) {
                right--;
            } 
            // Swap non-space characters
            else {
                char temp = resultArray[left];
                resultArray[left] = resultArray[right];
                resultArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(resultArray);
    }

    public static void main(String[] args) {
        String original = "I Am Not String";
        String reversed = reversePreservingWhitespace(original);
        
        System.out.println("Original: '" + original + "'");
        System.out.println("Reversed: '" + reversed + "'");
    }
}