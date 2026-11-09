package com.question1;


import java.util.Arrays;
import java.util.List;

public class WordFilter {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
            "The City Pune is Popular for Cool Environment"
        );

        list.stream()
            .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
            .filter(word -> word.startsWith("C"))
            .forEach(System.out::println);
    }
}
