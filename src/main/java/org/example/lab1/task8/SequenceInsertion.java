package org.example.lab1.task8;


import java.util.ArrayList;
import java.util.List;

public class SequenceInsertion {

    public List<Integer> findInsertionPositions(int[] firstArray, int[] secondArray) {
        List<Integer> positions = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] <= secondArray[j]) {
                i++;
            } else {
                positions.add(i + j);
                j++;
            }
        }
        if (j < secondArray.length) {
            for (; j < secondArray.length; j++) {
                positions.add(i + j);
            }
        }

        return positions;
    }
}
