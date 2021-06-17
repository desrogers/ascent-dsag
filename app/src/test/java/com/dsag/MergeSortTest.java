package com.dsag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    void sort_withArrayAndPointers_returnsEarly() {
        int[] expected = { 1, 5, 3 };
        int[] actual = { 1, 5, 3 };

        MergeSort.sort(expected, new int[expected.length], 1, 1);
        assertArrayEquals(expected,actual);
    }

    @Test
    void sort_withArray_sortsArrayInPlace() {
        int[] actual = { 1, 5, 3, 4 };
        int[] expected = { 1, 3, 4, 5 };
        MergeSort.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
