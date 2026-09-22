package com.question1;
public class ReverseFirstLastDigit {

    public static void main(String[] args) {

    	int num=12345;
		int orginal=num;
		
		//1.Find Last Digit
		int lastDigit=num%10;
		
		//2.Find First Digit
		int firstDigit=num;
		int divisor=1;
		while(firstDigit>=10) {
			
			firstDigit=firstDigit/10;
			divisor=divisor*10;
		}
		
		//3.Remove First and Last Digit
		int middle=(num%divisor)/10;
		System.out.println("Middle Is: "+middle);
		
		//4.Create a New Number
		int result=lastDigit*divisor+middle*10+firstDigit;
		
		//5.Display the Output
		System.out.println("Original Number: "+orginal);
		System.out.println("Result: "+result);
    }
}