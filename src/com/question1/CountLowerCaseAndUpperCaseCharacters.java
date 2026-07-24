package com.question1;

public class CountLowerCaseAndUpperCaseCharacters {

	public static void main(String[] args) {
String input="AaBbCcDdZ";
int upperCase=0;
int lowerCase=0;
char inputArray[]=input.toCharArray();

for(char tempChar:inputArray) {
	
	if(Character.isUpperCase(tempChar)) {
		upperCase++;
	}
	else if(Character.isLowerCase(tempChar)) {
		lowerCase++;
	}
}

System.out.println("The count of upper case characters are:" +upperCase);
System.out.println("The count of lower case characters are:" +lowerCase);


	}

}
