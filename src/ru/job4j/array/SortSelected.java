package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            //int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, MinDiapason.findMin(data, i, data.length - 1),
                                    i, data.length - 1);
            /* swap(...) */
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
