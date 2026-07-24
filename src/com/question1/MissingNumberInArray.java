package com.question1;

public class MissingNumberInArray {

	
	public static void main(String[] args) {

		int numbers[]= {1,2,4,5,6};
		int totalNumbers=numbers.length+1;
		System.out.println("The Count of Total Number is: "+totalNumbers);
		int sumOfTotalNumbers=(totalNumbers*(totalNumbers+1)/2);
		System.out.println("Sum of Total Numbers is: "+sumOfTotalNumbers);
		int sum=0;
		
		//Total Sum of the given array
		
		for(int index=0; index<numbers.length;index++)
		{
			sum=sum+numbers[index];
		}
		System.out.println("The Sum of the Given Array is: "+sum);
		System.out.println("The Missing Number of the Array is: "+(sumOfTotalNumbers-sum));
		
	}		
	

}
