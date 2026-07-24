package com.question1;

public class ReverseCasingOfString {

	public static void main(String[] args) {

		String input="Hello World";
		
		StringBuilder result=new StringBuilder();
		
		char data[]=input.toCharArray();
		
		for(char ch: data) {
			
			if(Character.isUpperCase(ch)) {
				
				result.append(Character.toLowerCase(ch));
			}
			
			else if (Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
				
			}
			
			else {
				result.append(ch);
			}
		}
		System.out.println("Orginal String is: "+input);
		System.out.println("Reverse Casing String is: " +result.toString());
	}

}
