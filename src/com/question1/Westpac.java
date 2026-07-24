package com.question1;
import java.util.Arrays;

public class Westpac {

    public static void main(String[] args) {

        String input = "KelcometowestpacW@321";

        String expectedWord = "Welcometowestpack";
        String expectedNumber = "123";
        String expectedSymbol = "@";

        String letters = input.replaceAll("[^A-Za-z]", "");
        String digits = input.replaceAll("[^0-9]", "");
        String symbols = input.replaceAll("[A-Za-z0-9]", "");

        if (isAnagram(letters, expectedWord)
                && isAnagram(digits, expectedNumber)
                && symbols.contains(expectedSymbol)) {
            System.out.println(expectedWord + " " +
                    expectedSymbol + " " +
                    expectedNumber);
        } else {
            System.out.println("Invalid Input");
        }
    }

    static boolean isAnagram(String s1, String s2) {

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}