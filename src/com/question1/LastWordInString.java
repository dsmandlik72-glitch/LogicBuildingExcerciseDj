package com.question1;

public class LastWordInString {

	public static void main(String[] args) {
		String str = "       Hello World        ";
		System.out.println("The length of the String before trim is:" + str.length());

		System.out.println("Hashcode before trim:" + str.hashCode());

		str = str.trim();
		System.out.println("Hashcode after trim:" + str.hashCode());

		int count = 0;

		char strArray[] = str.toCharArray();
		System.out.println("The length of the String is:" + strArray.length);

		for (int index = strArray.length - 1; index >= 0; index--) {
			if (strArray[index] != ' ') {
				count++;
			} else {
				if (count > 0) {
					System.out.println("Length of the last word is:" + count);
					break;
				}
			}

			/*
			 * String str="Hello World"; int count=0;
			 * 
			 * 
			 * char strArray[]=str.toCharArray(); System.out.println(strArray.length);
			 * 
			 * for(int index=strArray.length-1; index>=0;index--) { if(strArray[index]==' ')
			 * { count++; } else { if(count>0) { System.out.println(count); break; } } }
			 */
		}

	}
}