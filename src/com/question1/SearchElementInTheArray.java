package com.question1;

import java.util.Scanner;

public class SearchElementInTheArray {

	public static void main(String[] args) {

		
		int arr[]= {1,3,3,4,5,6,6,7,8,9,9};
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the element to Search: ");
		int searchNo=scanner.nextInt();
		System.out.println("Entered Number is: "+searchNo);
		boolean found=false;
		
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==searchNo) {
				System.out.println("Element found at Index: "+index);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Element not found");
		}
	}

}
