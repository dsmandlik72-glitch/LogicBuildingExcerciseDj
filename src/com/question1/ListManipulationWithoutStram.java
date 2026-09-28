package com.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListManipulationWithoutStram {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(11, 12, null, 22, 33, 13);

		List<Integer> resultList = new ArrayList<Integer>();

		for (Integer i : numberList) {
			if (i != null) {
				if (i.toString().startsWith("1")) {
					resultList.add(i);
				}
			}
		}
		System.out.println(resultList);
	}
}
