package com.question1;

import java.util.HashSet;

public class UniqueElementsFromArraySolution2WithoutSet {

	public static void main(String[] args) {
		int input[] = { 1, 2, 3, 1, 2 ,7,9};
		
		for(int i=0;i<input.length;i++) {
			
			int count=0;
			
			for(int j=0;j<input.length;j++) {
				if(input[i]==input[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(input[i]);
			}
		}

	}

}
