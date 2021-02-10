package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = first;
        if (max < second) {
            max = second;
            if (max < third) {
                max = third;
            }
        } else if (max < third) {
            max = third;
        }
        return max;
    }
}
