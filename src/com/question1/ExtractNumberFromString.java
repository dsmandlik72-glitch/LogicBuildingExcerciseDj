package com.question1;

public class ExtractNumberFromString {

	public static void main(String[] args) {

		
		String str="Java12345";
		
		String strNum="";
		
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				strNum=strNum+str.charAt(index);
			}
		}
		int number=Integer.parseInt(strNum);
		System.out.println("The number from the String is: "+number);
	}

}
