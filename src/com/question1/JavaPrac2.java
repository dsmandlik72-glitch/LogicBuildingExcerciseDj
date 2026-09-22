package com.question1;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaPrac2 {

	public static void main(String[] args) {

		String str = "My name is Dhananjay";
		char chArr[] = str.toCharArray();
		int left = 0;
		int right = chArr.length - 1;

		while (left < right) {
			if (chArr[left] == ' ') {
				left++;
			} else if (chArr[right] == ' ') {
				right--;
			} else {
				char temp = chArr[left];
				chArr[left] = chArr[right];
				chArr[right] = temp;
				left++;
				right--;
			}
		}
		for (char ch : chArr) {
			System.out.print(ch);
		}
	}
}
