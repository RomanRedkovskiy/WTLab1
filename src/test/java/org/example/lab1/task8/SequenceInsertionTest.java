package org.example.lab1.task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceInsertionTest {

    private final SequenceInsertion combiner = new SequenceInsertion();

    @Test
    void findInsertionPositionsWhenEmptyArraysShouldReturnEmptyArray() {
        //given
        int[] firstSequence = {};
        int[] secondSequence = {};
        //when
        List<Integer> actual = combiner.findInsertionPositions(firstSequence, secondSequence);
        List<Integer> expected = new ArrayList<>();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void findInsertionPositionsWhenFirstArrayIsEmptyShouldReturnEmptyArray() {
        //given
        int[] firstSequence = {2, 10, 15, 21, 26};
        int[] secondSequence = {};
        //when
        List<Integer> actual = combiner.findInsertionPositions(firstSequence, secondSequence);
        List<Integer> expected = new ArrayList<>();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void findInsertionPositionsWhenSecondArrayIsEmptyShouldReturnEmptyArray() {
        //given
        int[] firstSequence = {};
        int[] secondSequence = {-2, 10, 23, 26, 31};
        //when
        List<Integer> actual = combiner.findInsertionPositions(firstSequence, secondSequence);
        List<Integer> expected = IntStream.range(0, secondSequence.length)
                .boxed().collect(Collectors.toList()); //Array: {0, 1, 2, 3, 4}
        //then
        assertEquals(expected, actual);
    }

    @Test
    void findInsertionPositionsWhenFirstElementOfSecondSequenceIsBiggerThanLastElementOfFirstSequenceShouldReturnEndInsertionPositions() {
        //given
        int[] firstSequence = {0, 1, 2, 3, 4, 5};
        int[] secondSequence = {10, 23, 26, 31};
        //when
        List<Integer> actual = combiner.findInsertionPositions(firstSequence, secondSequence);
        List<Integer> expected = IntStream.range(firstSequence.length, firstSequence.length + secondSequence.length)
                .boxed().collect(Collectors.toList()); //Array: {6, 7, 8, 9}
        //then
        assertEquals(expected, actual);
    }

    @Test
    void findInsertionPositionsWhenDefaultSequencesShouldReturnChosenInsertionPositions() {
        //given
        int[] firstSequence = {1, 20, 30, 40, 50, 60};
        int[] secondSequence = {10, 23, 26, 31};
        //when
        List<Integer> actual = combiner.findInsertionPositions(firstSequence, secondSequence);
        List<Integer> expected = Arrays.asList(1, 3, 4, 6);
        //then
        assertEquals(expected, actual);
    }
}