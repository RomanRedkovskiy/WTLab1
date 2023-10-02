package org.example.lab1.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraySorterTest {

    private final ArraySorter arraySorter = new ArraySorter();

    @Test
    void sortArrayWhenEmptyArrayShouldReturnEmptyArray() {
        //given
        int[] arr = {};
        int[] expected = {};
        //when
        arraySorter.sortArray(arr);
        //then
        assertArrayEquals(expected, arr);
    }

    @Test
    void sortArrayWhenAlreadySortedShouldReturnInitialArray() {
        //given
        int[] arr = {10, 23, 26, 31};
        //when
        arraySorter.sortArray(arr);
        //then
        assertArrayEquals(arr, arr);
    }

    @Test
    void sortArrayWhenUnsortedArrayShouldReturnSortedArray() {
        //given
        int[] arr = {23, 31, 10, 26, 5, 4, 1};
        int[] expected = {1, 4, 5, 10, 23, 26, 31};
        //when
        arraySorter.sortArray(arr);
        //then
        assertArrayEquals(expected, arr);
    }
}