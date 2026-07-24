package com.question1;

public class ReversedFirstWordOfString {

	public static void main(String[] args) {
		String input="Hello World From Java";
		
		reverseFirstWord(input);
		
	}

	private static void reverseFirstWord(String input) {
		
		if(input==null || input.isEmpty()) {
			System.out.println("Can not reverse the string");
		}
		else {
			String words[]=input.split(" ", 2)	;
			char charArray[]=words[0].toCharArray();
			int left=0;
			int right=charArray.length-1;
			
			while(left<right) {
				char temp=charArray[left];
				charArray[left]=charArray[right];
				charArray[right]=temp;
				left++;
				right--;
			}
			
			String reversedFirstWord=new String(charArray);
			System.out.println(input);
			System.out.println("Reversed First Word of String: "+reversedFirstWord+" "+words[1]);
	}

}}
