package com.question1;

public class SumOfArray {

	public static void main(String[] args) {
		int numbers[] = { 1, 24, 33, 44 };
		int sum = 0;

		for (int index = 0; index < numbers.length; index++) {
			sum = sum + numbers[index];
		}
		System.out.println("The Sum of Array Element is: "+sum);
	}

}
