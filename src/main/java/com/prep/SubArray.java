package com.prep;

public class SubArray {

//            1
//            1 2
//            1 2 3
//            1 2 3 4
//            2
//            2 3
//            2 3 4
//            3
//            3 4
//            4

    public static void main(String[] args) {

        int [] array = new int[]{1,2,3,4};

        for (int index =0; index < array.length; index++) {

            for (int indexj = index; indexj < array.length; indexj++) {

                 for (int k = index; k <= indexj; k++) {

                   System.out.print(array[k] +" ");
                 }

                System.out.println("");
            }
        }
    }
}
