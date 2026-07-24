package com.question1;

public class LengthOfString {

	public static void main(String[] args) {
String str="Sky is blue and vast";
int count;

String arr[]=str.split(" ");

for(int index=0;index<=arr.length-1;index++)
{
	 count=arr[index].length();
	 if(count%2==0)
	 {
		 System.out.println(arr[index]);
	 }
	
}
		
		
		
		
		
		/*char strArr[] = str.toCharArray();
		int count = 0;

		for (int index = 0; index <= strArr.length - 1; index++) {
			
				count++;

			}
		System.out.println(count);*/
		}

	}


