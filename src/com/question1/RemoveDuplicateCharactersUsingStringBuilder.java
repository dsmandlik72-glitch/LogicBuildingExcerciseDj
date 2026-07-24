package com.question1;

public class RemoveDuplicateCharactersUsingStringBuilder {

	public static void main(String[] args) {
	

		  

		        String str = "programming";
		        StringBuilder result = new StringBuilder();

		        for (int i = 0; i < str.length(); i++) {

		            char ch = str.charAt(i);

		            // Check if character already exists in StringBuilder
		            if (result.indexOf(String.valueOf(ch)) == -1) {
		                result.append(ch);
		            }
		        }

		        System.out.println("Original String : " + str);
		        System.out.println("After Removing Duplicates : " + result);
		    }
		}
	


