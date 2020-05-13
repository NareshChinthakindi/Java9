package com.prep;

import java.util.Arrays;
import java.util.List;

public class SumofArray {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

    }
}
