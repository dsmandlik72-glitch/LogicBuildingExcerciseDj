package com.question1;

public class SwapOfTwoNumbersUsingE {

	public static void main(String[] args) {
int a=20;
int b=10;

System.out.println("Value of a before swapping: "+a);
System.out.println("Value of b before swapping: "+b);

a=a^b;
System.out.println("Value of a: "+a);
b=a^b;
System.out.println("Value of b: "+b);
a=a^b;
System.out.println("Value of a: "+a);

System.out.println("Value of a after Swapping is:" +a + "  " +"Value of b after Swapping is: " +b);

	}

}
