package com.question1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class WordFilterUsingStreamAndForLoop {
	public static void main(String[] args) {
		 List<String> list=Arrays.asList("Pune is Cool City in Maharasthra and  Chandigarh chennai");
		 
//	list.stream()
//	.flatMap(senetence->Arrays.stream(senetence.split("\\s+")))
//	.filter(word->word.startsWith("C") || word.startsWith("c"))
//	.forEach(System.out::println);
//	//.forEach(word->System.out.println(word));
		 
		 
		 for(String senetnce:list) {
			 
			 String words[]=senetnce.split("\\s+");
			 
			 for(String word:words) {
				 if(word.startsWith("C") || word.startsWith("c")) {
					 System.out.print(word+" ");
				 }
			 }
		 }
	}
}
