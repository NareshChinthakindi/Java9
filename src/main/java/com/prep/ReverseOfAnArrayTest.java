package com.prep;

public class ReverseOfAnArrayTest {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        printArray(arr);

        reverseOfArray(arr, 0, arr.length-1);

        printArray(arr);
    }

    private static void reverseOfArray(int[] arr, int start, int end) {

           while (start < end) {
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               end--;
               start++;

           }
    }

    private static void printArray(int[] arr) {

        System.out.println();
        for (int ar : arr) {
            System.out.print(ar+" ");
        }
    }


}
