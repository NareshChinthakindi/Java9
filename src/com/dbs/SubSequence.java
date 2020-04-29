package com.dbs;

import java.math.BigInteger;

public class SubSequence {
    static int arr[] = new int[]{1, 2, 3, 4};

    static void printSubsequences(int n)
    {
        int opsize = (int)Math.pow(2 , n);

        for ( int counter = 1; counter < opsize; counter++) {

             for (int j =0; j < n; j++) {

                   if (BigInteger.valueOf(counter).testBit(j)) {
                       System.out.print(arr[j]+" ");
                   }
            }
            System.out.println();
        }
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.println("All Non-empty Subsequences");
        printSubsequences(arr.length);
    }
}
