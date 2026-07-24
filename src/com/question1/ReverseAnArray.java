package com.question1;

public class ReverseAnArray {

	public static void main(String[] args) {
int arr[]= {10,20,30,40};

int reverseArray[]=new int[arr.length];

int reverseArrayIndex=0;

for(int index=arr.length-1;index>=0;index--) {
	reverseArray[reverseArrayIndex]=arr[index];
	reverseArrayIndex++;
}

for(int revArray:reverseArray) {
	System.out.print(revArray+" ");
}

arr=reverseArray;

for(int orgArr:arr) {
	System.out.print(orgArr+" ");

}

	}

}
