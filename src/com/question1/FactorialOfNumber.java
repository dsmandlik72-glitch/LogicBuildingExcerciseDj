package com.question1;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
int number;
BigInteger result=BigInteger.ONE;

Scanner scanner=new Scanner(System.in);

System.out.println("Enter the number");
number=scanner.nextInt();

for(int i=1; i<=number;i++)
{
	result=result.multiply(BigInteger.valueOf(i));
}

System.out.println(result);
	}

}
