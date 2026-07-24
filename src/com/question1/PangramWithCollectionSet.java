package com.question1;

import java.util.HashSet;

public class PangramWithCollectionSet {

	public static void main(String[] args) {

		String input="bcdefghijklmnopqrstuvwxyz";
		
		boolean result=checkPangram(input);
		
		if(result) {
			System.out.println("String is Pangram");
		}
		else {
			System.out.println("Npoe!! It's Not");
		}
	}

	private static boolean checkPangram(String input) {
		if(input.length()<26) {
			return false;
		}
		
	
		HashSet<Character> characterSet=new HashSet<Character>();
		char inputChar[]=input.toLowerCase().toCharArray();
		
		for(char ch: inputChar) {
			
			if(Character.isLetter(ch)) {
				characterSet.add(ch);
				
			}
		}
			if(characterSet.size()==26) {
				return true;
		}
			
			return false;
	}

}
