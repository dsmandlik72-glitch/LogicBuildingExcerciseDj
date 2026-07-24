package com.question1;

public class ReverseAnArrayPart2 {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50,60};
		int right=array.length-1;
		int left=0;
		int temp;
		while(right>left) {
			temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			right--;
			left++;
		}
for(int tempVar:array) {
	System.out.println(tempVar);
}
	}

}
