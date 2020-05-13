package com.prep;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayElementsWithCount {

    public static void main(String[] args) {
        List<String> elements = Arrays.asList("Java", "Spring", "Java", "Abc");

        Map<String, Long> elementsWithCount = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        elementsWithCount.forEach((k,v)-> System.out.println("key: "+k+"  count:"+v));

        Map<String, Long> sortedMap = new LinkedHashMap<>();

        elementsWithCount.keySet().stream().sorted().forEach(key ->{
            sortedMap.put(key, elementsWithCount.get(key));
        });

        sortedMap.forEach((k,v)-> System.out.println("key: "+k+"  count:"+v));

    }
}
