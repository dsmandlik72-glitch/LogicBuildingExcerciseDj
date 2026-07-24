package com.question1;

public class CheckWhetherNumberIsArmstrongOrNot {

	public static void main(String[] args) {
		int number = 153;
		int copyNumber = number;
		int lastDigit;
		int armStrong = 0;
		

		while (copyNumber != 0) {
			lastDigit = copyNumber % 10;
			armStrong = armStrong + (lastDigit * lastDigit * lastDigit);
			copyNumber = copyNumber / 10;

		}
		if (armStrong == number) {
			System.out.println("Number is Armstrong");

		}
		else
		{
			System.out.println("Number is not Armstrong");

		}
	}

}
