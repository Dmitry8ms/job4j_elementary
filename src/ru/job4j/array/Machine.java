package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    /* Сработало, но слишком длинный код
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int difference = money - price;
            for (int i = 0; i < coins.length; i++) {
                if (difference - coins[i] >= 0) {
                    rsl[size] = coins[i];
                    size++;
                    difference = difference - coins[i];
                    if (difference == 0) {
                        break;
                    }
                    i--;
                }
            }
        return Arrays.copyOf(rsl, size);
    }*/
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            while (money - coins[i] >= price) {
                rsl[size] = coins[i];
                size++;
                money = money - coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
