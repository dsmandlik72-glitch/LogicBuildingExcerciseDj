package com.question1;

public class FindLargestNumberInArray {

	public static void main(String[] args) {

		int arr[]= {10,9,8,50,89,3};
		
		int largest=arr[0];
		
		for(int index=1;index<arr.length-1;index++) {
			if(arr[index]>largest) {
				largest=arr[index];
			}
		}
		System.out.println(largest);
	}

}
