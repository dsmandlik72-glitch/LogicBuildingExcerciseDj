package com.question1;

import java.util.ArrayList;

public class FindCommonElementsFromTheList {

	public static void main(String[] args) {

		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("One");
		list1.add("How");
		list1.add("Ten");
		
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("Two");
		list2.add("Ten");
		list2.add("How");
		list2.add("One");

		list1.retainAll(list2);
		
		System.out.println("Common Elements are: "+ list1);
		
	}

}
