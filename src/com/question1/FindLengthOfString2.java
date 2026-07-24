package com.question1;

public class FindLengthOfString2 {

	public static void main(String[] args) {
		String data = "Hello world";
		System.out.println(data.length());
		int count = 0;

		while (true) {
			try {
				data.charAt(count);
				count++;
			} catch (IndexOutOfBoundsException e) {

				System.out.println(count);
				break;
			}
		}
	}

}
