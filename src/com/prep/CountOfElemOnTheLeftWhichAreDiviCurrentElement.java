package com.prep;

public class CountOfElemOnTheLeftWhichAreDiviCurrentElement {


    public static void main(String[] args) {
        int[] arr = new int[]{8, 1, 28, 4, 2, 6, 7};


           for (int i = 0; i < arr.length; i++) {

                int count = 0;

                   for ( int j = 0; j < i; j++ ) {

                           if (arr[j] % arr[i] == 0) {
                                count++;
                           }
                   }

               System.out.print(count +" ");

        }
    }
}
