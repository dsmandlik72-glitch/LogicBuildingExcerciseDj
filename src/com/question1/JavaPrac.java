package com.question1;

public class JavaPrac {

	public static void main(String[] args) {

		String input="I am not String";
		
		int left=0;
		int right=input.length()-1;
		char ch[]=input.toCharArray();
		char temp;
		while(left<right) {
			
			if(Character.isWhitespace(ch[left])) {
				left++;
			}
			else if(Character.isWhitespace(ch[right])) {
				right--;
			}
			else {
				temp=ch[right];
			ch[right]=	ch[left];
			ch[left]=temp;
			left++;
			right--;
			}
		}
		String rev=new String(ch);
		System.out.println(rev);
	}

}
