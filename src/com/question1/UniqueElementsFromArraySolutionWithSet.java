package com.question1;

import java.util.HashSet;

public class UniqueElementsFromArraySolutionWithSet {

	public static void main(String[] args) {
		int input[] = { 1, 2, 3, 1, 2 };
		HashSet<Integer> seen=new HashSet<Integer>();
		HashSet<Integer> duplicate=new HashSet<Integer>();
		
		for(int no:input) {
			
			if(!seen.add(no)) {
				duplicate.add(no);
			}
		}
		System.out.println("Seen Set Elements are:"+seen);
		System.out.println("Duplicate Set Elements are:"+duplicate);
		seen.removeAll(duplicate);
		System.out.println("Unique Elements in the Array are:"+seen);

	}

}
