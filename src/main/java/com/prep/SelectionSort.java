package com.prep;

public class SelectionSort {

//	The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
//	from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
//
//	1) The subarray which is already sorted.
//	2) Remaining subarray which is unsorted.
//
//	In every iteration of selection sort, the minimum element (considering ascending order) from the
//	unsorted subarray is picked and moved to the sorted subarray.

    //The smallest element will be moved to the min Index(0,1,2...)

    /**
     * @param args
     *
     * Time Complexity: O(n2) as there are two nested loops.
    Auxiliary Space: O(1)
    =The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
     */
    public static void main(String[] args) {
        int array[] = {3,5,21,456,21,345,12312,1};

        PrimitiveUtils.printArray(array);

        selectionSort(array, array.length);

        PrimitiveUtils.printArray(array);
    }

    private static void selectionSort(int[] array, int length) {

         boolean flag = false;

        for (int index =0; index<length; index++) {

             int minIndex = index;
             for(int j = index+1; j<length; j++) {

                   if (array[minIndex] > array[j]) {
                       minIndex = j;
                       flag = true;
                   }
             }

             if (!flag) {
                 break;
             }

             flag = false;

             PrimitiveUtils.swap(array, minIndex , index);
        }

    }
}
