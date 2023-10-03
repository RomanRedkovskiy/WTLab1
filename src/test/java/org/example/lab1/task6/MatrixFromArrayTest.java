package org.example.lab1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixFromArrayTest {

    private final MatrixFromArray matrixFromArray = new MatrixFromArray();

    @Test
    void createMatrixWhenEmptyArrayShouldReturnEmptyMatrix() {
        //given
        int[] arr = {};
        //when
        int[][] expected = new int[][]{};
        int[][] actual = matrixFromArray.createMatrix(arr);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void createMatrixWhenSingleElementArrayShouldReturnSingleElementMatrix() {
        //given
        int[] arr = {1};
        //when
        int[][] expected = new int[][]{new int[]{1}};
        int[][] actual = matrixFromArray.createMatrix(arr);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void createMatrixWhenThreeElementArrayShouldReturnThreeOnThreeMatrix() {
        //given
        int[] arr = {10, 23, 31};
        //when
        int[][] expected = new int[][]{
                new int[]{10, 23, 31},
                new int[]{23, 31, 10},
                new int[]{31, 10, 23}
        };
        int[][] actual = matrixFromArray.createMatrix(arr);
        //then
        assertArrayEquals(expected, actual);
    }
}