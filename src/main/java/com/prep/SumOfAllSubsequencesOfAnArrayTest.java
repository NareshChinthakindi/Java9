package com.prep;

public class SumOfAllSubsequencesOfAnArrayTest {


    public static void main(String[] args) {
        int arr[] = { 1, 2,3};
        int n = arr.length;
        System.out.print(findSum(arr, n));
    }

    private static int findSum(int[] arr, int n) {

        int sum = 0;

        for (int index = 0; index < n; index++) {

             sum+= arr[index];
        }

        return sum * (1<< (n-1));

    }
}
