package com.prep;

public class SumOfEvenAndOddElementsInAnArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int even = 0, odd = 0;

        for (int index =0; index < arr.length; index++) {

                if (arr[index] % 2 == 0) {
                    even+= arr[index];
                } else {
                    odd+= arr[index];
                }
        }

        System.out.println("Even count "+even+" odd count "+odd);
    }
}
