package com.dsag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuicksortTest {
    @Test
    public void sort_withIntArray_sortsArray() {
        int[] expected = { 1, 2, 3 };
        int[] actual = { 3, 2, 1 };

        Quicksort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    void partition_returnsPivotPointIndex() {
        int expected = 1;
        int actual = Quicksort.partition(new int[]{3, 2, 1}, 0, 1, 2);
        assertEquals(expected, actual);
    }
}
