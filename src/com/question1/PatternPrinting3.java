package com.question1;

public class PatternPrinting3 {

	public static void main(String[] args) {
int number=5;

for(int row=1; row<=5;row++)
{
	for(int col=1;col<=row;col++)
	{
		System.out.print((char)('a'+col-1));
	}
	System.out.println("");

}
	}

}