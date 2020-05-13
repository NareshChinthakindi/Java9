package com.prep;

import java.math.BigInteger;

public class SubSequenceTest {

//            1
//            2
//            1 2
//            3
//            1 3
//            2 3
//            1 2 3
//            4
//            1 4
//            2 4
//            1 2 4
//            3 4
//            1 3 4
//            2 3 4
//            1 2 3 4

    static int arr[] = new int[]{1, 2, 3, 4};

    static void printSubsequences(int n)
    {
//        int opSize = (int)Math.pow(2 , n);
////
////        for ( int counter = 1; counter < opSize; counter++) {
////
////             for (int j =0; j < n; j++) {
////
////                   if (BigInteger.valueOf(counter).testBit(j)) {
////                       System.out.print(arr[j]+" ");
////                   }
////            }
////            System.out.println();
////        }

        int opSize = (int)Math.pow(2 ,n);

        for(int counter = 0; counter < opSize; counter++) {

                 for( int j =0; j<n; j++) {

                      if(BigInteger.valueOf(counter).testBit(j)) {
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
