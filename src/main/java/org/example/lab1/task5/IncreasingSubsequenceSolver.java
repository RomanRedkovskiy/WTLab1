package org.example.lab1.task5;

import java.util.Arrays;

public class IncreasingSubsequenceSolver {

    public int getIncreasingSubsequence(int[] inputSequence) {
        int[] sequence = new int[inputSequence.length];
        Arrays.fill(sequence, 1);
        for (int i = 1; i < inputSequence.length; i++) {
            for (int j = 0; j < i; j++) {
                if (inputSequence[j] < inputSequence[i]) {
                    sequence[i] = Math.max(sequence[i], sequence[j] + 1);
                }
            }
        }
        return sequence.length - Arrays.stream(sequence).max().orElse(0);
    }
}
