package com.dsag;


public class BubbleSort {
    public static void  sort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }

    private static void swap(int[] array, int i, int i1) {
        int tmp = array[i1];
        array[i1] = array[i];
        array[i] = tmp;
    }
}
