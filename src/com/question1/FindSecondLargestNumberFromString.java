package com.question1;

public class FindSecondLargestNumberFromString {

	public static void main(String[] args) {
String input="a1b2c0";

findSecondLargest(input);
	}

	private static void findSecondLargest(String input) {

		char data[]=input.toCharArray();
		int num;
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		
		
		for(char character:data) {
			
			if(Character.isDigit(character)) {
				num=character-'0';
				if(num>first) {
					second=first;
					first=num;
				}
				else if(num>second && num<first) {
					second=num;
				}
				
			}
		}
		System.out.println("Sceond largest Number is: "+second);
	}

}
