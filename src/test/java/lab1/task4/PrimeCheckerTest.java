package lab1.task4;

import org.example.lab1.task4.PrimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    void primeNumberArrayFromNumberArrayWhenEmptyShouldReturnEmptyArray() {
        //given
        int[] arr = {};
        int[] expected = {};
        //when
        int[] actual = primeChecker.primeNumberArrayFromNumberArray(arr);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void primeNumberArrayFromNumberArrayWhenAllNonPrimeShouldReturnEmptyArray(){
        //given
        int[] arr = {-2, 20, 235, 49, 1060500292, -256, 256, 99999, 8633};
        int[] expected = {};
        //when
        int[] actual = primeChecker.primeNumberArrayFromNumberArray(arr);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void primeNumberArrayFromNumberArrayWhenAllPrimeShouldReturnNaturalNumbersArray() {
        //given
        int[] arr = {37, 47, 31, 41, 43, 53, 61, 71, 73, 83, 97, 79, 89, 2, 3, 5};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //when
        int[] actual = primeChecker.primeNumberArrayFromNumberArray(arr);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void primeNumberArrayFromNumberArrayWhenSomePrimeShouldReturnChosenNumbersArray() {
        //given
        int[] arr = {37, 48, 31, 42, 44, 53, 61, 71, 73, 83, 97, 79, 89, 20, 30, 50};
        int[] expected = {0, 2, 5, 6, 7, 8, 9, 10, 11, 12};
        //when
        int[] actual = primeChecker.primeNumberArrayFromNumberArray(arr);
        //then
        assertArrayEquals(expected, actual);
    }
}