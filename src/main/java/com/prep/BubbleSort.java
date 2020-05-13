package com.prep;

public class BubbleSort {

    /**
     * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent
     *  elements if they are in wrong order.
     *
     *  The largest element will be moved to end of the array.
     * @param args
     */

//
//	Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
//
//	Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
//
//	Auxiliary Space: O(1)
//
//	Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
//
//	Sorting In Place: Yes
//
//	Stable: Yes

    //Both Bubble and Selection sort algorithms are slow sorting algorithms
    public static void main(String[] args) {
        int array[] = {3,5,21,456,21,345,12312,1};

        PrimitiveUtils.printArray(array);

        bubbleSort(array, array.length);

        PrimitiveUtils.printArray(array);
    }

    private static void bubbleSort(int[] array, int length) {

         boolean flag = false;

          for(int index =0; index < length; index++) {

               for(int j = 0; j < length-index-1; j++) {

                   if (array[j]>array[j+1]) {
                       PrimitiveUtils.swap(array, j, j+1);
                       flag = true;
                   }

               }

               if(!flag) {
                   break;
               }

               flag = false;
          }
    }


}
