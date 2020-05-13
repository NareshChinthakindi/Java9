package com.prep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLengthStreamsTest {

    public static void main(String[] args) {
        List<String> elements = Arrays.asList("Naresh", "Suresh");

        List<Integer> elementsLength = elements.stream().map(String::length).collect(Collectors.toList());

        elementsLength.forEach(System.out::println);
    }
}
