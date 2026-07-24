package com.question1;

import java.util.Scanner;

public class PrintEvenWordsFromString {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
String str;
System.out.println("Enter the string:");
str=scanner.nextLine();

String dataArr[]=str.split(" ");

for(String word:dataArr)
{
	if(word.length()%2==0)
	{
		System.out.println(word);
	}
}
System.out.println("No words in the string are even");
	}

}
