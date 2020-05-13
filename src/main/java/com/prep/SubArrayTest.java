package com.prep;

public class SubArrayTest {

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

       int arrary[] = {1,2,3,4};

        for (int i = 0; i < arrary.length; i++) {

                  for (int j = i; j < arrary.length; j++) {

                          for (int k = i; k <= j; k++) {
                              System.out.print(arrary[k] +" ");
                          }
                      System.out.println();
                  }

        }

        }
}
