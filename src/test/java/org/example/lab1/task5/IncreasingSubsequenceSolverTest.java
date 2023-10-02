package org.example.lab1.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncreasingSubsequenceSolverTest {

    private final IncreasingSubsequenceSolver increasingSubsequenceSolver = new IncreasingSubsequenceSolver();

    @Test
    void getIncreasingSubsequenceWhenIncreasingSequenceShouldReturnZero() {
        //given
        int[] sequence = {10, 23, 26, 31};
        int expected = 0;
        //when
        int actual = increasingSubsequenceSolver.getIncreasingSubsequence(sequence);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void getIncreasingSubsequenceWhenDecreasingSequenceShouldReturnSequenceSizeMinusOne() {
        //given
        int[] sequence = {100, 90, 89, 69, 31, 23, 10};
        int expected = sequence.length - 1;
        //when
        int actual = increasingSubsequenceSolver.getIncreasingSubsequence(sequence);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void getIncreasingSubsequenceWhenNormalSequenceShouldReturnDeletedNumbersAmount() {
        //given
        int[] sequence = {2, 3, 10, 1, 12, 5, 7};
        int expected = 3;
        //when
        int actual = increasingSubsequenceSolver.getIncreasingSubsequence(sequence);
        //then
        assertEquals(expected, actual);
    }
}