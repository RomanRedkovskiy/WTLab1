package org.example.lab1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixFromArrayTest {

    private final MatrixFromArray matrixFromArray = new MatrixFromArray();

    @Test
    void createMatrixWhenEmptyArrayShouldReturnEmptyMatrix() {
        //given
        int[] arr = {};
        int[][] expected = new int[][]{};
        //when
        int[][] actual = matrixFromArray.createMatrix(arr);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void createMatrixWhenSingleElementArrayShouldReturnSingleElementMatrix() {
        //given
        int[] arr = {1};
        int[][] expected = new int[][]{new int[]{1}};
        //when
        int[][] actual = matrixFromArray.createMatrix(arr);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void createMatrixWhenThreeElementArrayShouldReturnThreeOnThreeMatrix() {
        //given
        int[] arr = {10, 23, 31};
        int[][] expected = new int[][]{
                new int[]{10, 23, 31},
                new int[]{23, 31, 10},
                new int[]{31, 10, 23}
        };
        //when
        int[][] actual = matrixFromArray.createMatrix(arr);
        //then
        assertArrayEquals(expected, actual);
    }
}