package com.question1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CheckTwoStringArePanagramWithSort {
	public static void main(String[] args) {
		String str1 = "Keep";
		String str2 = "Peek";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if (str1.length() == str2.length()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("Nope");
			}

		} else {
			System.out.println("String is not Anagram");
		}
	}
}