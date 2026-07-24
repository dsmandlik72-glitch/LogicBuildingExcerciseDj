package com.question1;

public class CountTotalNumberOfCharactersInAStringButWithATwist {

	public static void main(String[] args) {

		String input = " Hie ";
		int count = 0;

		char dataArray[] = input.toCharArray();

		for (int index = 0; index < dataArray.length; index++) {
			if (dataArray[index] == ' ') {
				continue;
			}

			boolean whiteSpacePresentAfterTheChar = index < dataArray.length - 1 && dataArray[index + 1] == ' ';
			boolean whiteSpacePresentBeforeTheChar = index > 0 && dataArray[index - 1] == ' ';

			if (!whiteSpacePresentAfterTheChar && !whiteSpacePresentBeforeTheChar) {
				count++;
			}

		}

		System.out.println("Count is: " + count);

	}

}
