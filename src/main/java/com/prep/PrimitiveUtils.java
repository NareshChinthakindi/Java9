package com.prep;

public class PrimitiveUtils {


    public static void printArray(int[] arr) {

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+ " ");
        }

        System.out.println();
    }

    public static void swap(int[] array, int j, int k) {

        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }
}
