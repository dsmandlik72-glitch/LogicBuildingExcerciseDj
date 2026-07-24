package com.question1;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
int a[]= {1,3,2,7,5};
int largestNumber=Integer.MIN_VALUE;
int secondLargest=Integer.MIN_VALUE;

for(int no: a) {
	if(no>largestNumber) {
		secondLargest=largestNumber;
		largestNumber=no;
	}
	else if(no>secondLargest && no!=largestNumber) {
		secondLargest=no;
	}
}
System.out.println("The second largest number is:" +secondLargest);
	}

}
