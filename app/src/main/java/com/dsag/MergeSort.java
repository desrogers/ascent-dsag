package com.dsag;

public class MergeSort {
    public static void sort(int[] array) {
        sort(array, new int[array.length], 0, array.length - 1);
    }

    public static void sort(int[] array, int[] tmp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) return;

        int leftEnd = (leftStart + rightEnd) / 2;
        sort(array, tmp, leftStart, leftEnd);
        sort(array, tmp, leftEnd + 1, rightEnd);
        merge(array, tmp, leftStart, rightEnd);
    }

    private static void merge(int[] array, int[] tmp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = leftEnd + 1;
        int index = left;
        while(left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                tmp[index] = array[left];
                left++;
            } else {
                tmp[index] = array[right];
                right++;
            }
            index++;
        }
        System.arraycopy(array, left, tmp, index, leftEnd - left + 1);
        System.arraycopy(array, right, tmp, index, rightEnd - right + 1);
        System.arraycopy(tmp, leftStart, array, leftStart, size);
    }
}
