package com.prep;

public class ReverseOfAnArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        PrimitiveUtils.printArray(arr);

        reverseOfArray(arr, 0, arr.length-1);

        PrimitiveUtils.printArray(arr);
    }

    private static void reverseOfArray(int[] arr, int start, int end) {


      while(start < end) {

        int temp = arr[start];

        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }

    }

}
