package org.example.lab1.task7;

public class ArraySorter {

    public void sortArray(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                swap(arr, i, i + 1);
                if (i > 0) {
                    i--;
                }
            }
        }
    }

    private void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
