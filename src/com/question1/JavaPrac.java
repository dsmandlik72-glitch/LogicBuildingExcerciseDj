package com.question1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JavaPrac {

	public static void main(String[] args) {

List<Integer> numberList=Arrays.asList(10,20,30,null,101,1001);

 List<Integer> result=numberList.stream()
.filter(i->Objects.nonNull(i))
.filter(i->i.toString().startsWith("1"))
.collect(Collectors.toList());
 
 System.out.println(result);
	}

}
