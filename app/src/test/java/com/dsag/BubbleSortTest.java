package com.dsag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    void sort_sortsArrayInPlace() {
        int[] expected = { 1, 2, 3, 5, 9, 12 };
        int[] actual = { 2, 1, 5, 3, 12, 9 };
        BubbleSort.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
