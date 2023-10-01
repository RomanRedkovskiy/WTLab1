package org.example.lab1.task4;

import java.util.stream.IntStream;

public class PrimeChecker {

    public int[] primeNumberArrayFromNumberArray(int[] arr) {
        return IntStream.range(0, arr.length).filter(i -> isPrime(arr[i])).toArray();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
