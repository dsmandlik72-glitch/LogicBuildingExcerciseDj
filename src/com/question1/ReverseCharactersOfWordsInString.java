package com.question1;

public class ReverseCharactersOfWordsInString {

	public static void main(String[] args) {
String input="This is fun";
String result="";

String words[]=input.split(" ");


for(String word: words) {
	
	char character[]=word.toCharArray();
	
	int left=0;
	int right=character.length-1;
	
	
	if(right>left)
	{
		char temp=character[left];
		character[left]=character[right];
		character[right]=temp;
		left++;
		right--;
	}
	
	result=result+new String(character)+" ";
	
	  
	
}
System.out.println(input);
System.out.println(result);

	}

}
