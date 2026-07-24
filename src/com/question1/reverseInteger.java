package com.question1;

import java.util.Scanner;

public class reverseInteger {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int number;
		System.out.println("Enter the number which you want to reverse");
		number=scanner.nextInt();
		int lastDigit;
		int reverseNumber=0;
		
		while(number!=0)
		{
			lastDigit=number%10;
			if(reverseNumber>Integer.MAX_VALUE/10 || reverseNumber==Integer.MAX_VALUE/10 && lastDigit>7)
				
			{
				System.out.println(0);
				System.exit(0);
			}
			
			if(reverseNumber<Integer.MIN_VALUE/10 || reverseNumber==Integer.MIN_VALUE/10 && lastDigit<-8)
{
	System.out.println(0);
	System.exit(0);
	}
			
			reverseNumber=reverseNumber*10+lastDigit;
			number=number/10;
		}
		System.out.println("Reverse Number is: "+reverseNumber);

}
}
