package com.question1;

public class SwapTwoNumbersWithoutTempVar {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Before Swapping a is:" + a);
		System.out.println("Before Swapping b is:" + b);
		System.out.println("Below is the Result of Swapping");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping a is:" + a);
		System.out.println("After Swapping b is:" + b);

	}

}
