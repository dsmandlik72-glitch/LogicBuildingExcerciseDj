package com.question1;

public class RearrangeString {

    public static void main(String[] args) {

        String str = "1ab2";

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        // Separate letters and digits
        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {
                letters.append(Character.toUpperCase(ch));
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }

        // Rearrange
        String output = "" + letters.charAt(0)
                + digits
                + letters.charAt(1);

        System.out.println(output);
    }
}