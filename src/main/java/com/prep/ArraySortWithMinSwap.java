package com.prep;

public class ArraySortWithMinSwap {

    public static void main(String[] args) {
        int array[] = {1,3,2,7,6,4,5};

        System.out.println(minimumSwaps(array));

    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            while(arr[i] != i+1) {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
                count ++;
            }
        }
        return count;
    }
}
