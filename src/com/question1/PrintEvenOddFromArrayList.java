package com.question1;

import java.util.ArrayList;

public class PrintEvenOddFromArrayList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Java");
		al.add(24);
		al.add(13);
		al.add(13.5);
		al.add(null);
		al.add(null);

		for (Object o : al) {
			if (o instanceof Integer) {
				Integer i = (Integer) o;
				int num = i.intValue();

				if (num % 2 == 0) {
					System.out.println("Even is: " + num);
				} else {
					System.out.println("Odd is: " + num);

				}
			}
		}

	}

}
