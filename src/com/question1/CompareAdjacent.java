package com.question1;

public class CompareAdjacent {

	public static void main(String[] args) {
		String str="658488";
		
		StringBuilder output=new StringBuilder();
		
		
		for(int index=0;index<str.length()-1;index++) {
			
			if(str.charAt(index)>str.charAt(index+1)) {
				output.append('>');
			}
			else if(str.charAt(index)<str.charAt(index+1)) {
				output.append('<');
			}
			else  {
				output.append('=');
			}
		}
		System.out.println(output);
	}
}