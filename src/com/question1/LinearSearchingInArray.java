package com.question1;

import java.util.Scanner;

public class LinearSearchingInArray {

	public static void main(String[] args) {
int inputArray[]= {10,20,30,40,50};
int key;
boolean isStatus=false;
int position=-1;

Scanner scanner=new Scanner(System.in);
System.out.println("Enter the value that you want to check in the Array: ");
key=scanner.nextInt();

/*for(int number:inputArray) {
	if(number==key) {
		isStatus=true;
		break;
	}
}*/
for(int index=0;index<inputArray.length;index++) {
	System.out.println(inputArray[index]);
	if(inputArray[index]==key) {
		isStatus=true;
		position=index;
		
		
	}
}
if(isStatus) {
	System.out.println("Value found in the Array at the position: "+position);
}
else {
	System.out.println("Value not present in the Array");

}
	}

}
