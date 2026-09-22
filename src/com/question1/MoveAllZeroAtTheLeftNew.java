package com.question1;

import java.util.Arrays;

public class MoveAllZeroAtTheLeftNew {

	public static void main(String[] args) {

		String str = "Java is a programming language";

		String words[] = str.split(" ");

		String lastWord = words[words.length - 1];
		System.out.println(lastWord);

		char lastWordArr[] = lastWord.toCharArray();
		String rev = "";
		for (int i = lastWord.length() - 1; i >= 0; i--) {
			rev = rev + lastWord.charAt(i);

		}
		words[words.length - 1] = rev;
		
		System.out.println(Arrays.toString(words));
		
		String result=String.join(" ", words);
		System.out.println(result);
	}
}
