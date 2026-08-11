package com.question1;
import java.util.Arrays;

public class ReverseArrayStrings {

    public static void main(String[] args) {

        String[] input = {"tsys", "gpay"};

        String[] output = transform(input);

        System.out.println(Arrays.toString(output));
    }

    public static String[] transform(String[] input) {

        String[] output = new String[input.length];

        for (int i = 0; i < input.length; i++) {

            String str = input[i];
            String reverse = "";

            for (int j = str.length() - 1; j >= 0; j--) {
                reverse = reverse + str.charAt(j);
            }

            output[input.length - 1 - i] = reverse;
        }

        return output;
    }
}