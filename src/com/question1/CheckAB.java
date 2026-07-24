package com.question1;
public class CheckAB {

    public static void main(String[] args) {

        String str = "aaabb";

        boolean foundB = false;
        boolean result = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'b') {
                foundB = true;
            }

            if (ch == 'a' && foundB) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}