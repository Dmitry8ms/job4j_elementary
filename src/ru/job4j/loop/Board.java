package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        boolean x = true;
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                /* печатаем X - width раз. */
                if (x) {
                    System.out.print("X");
                    x = false;
                } else {
                    System.out.print(" ");
                    x = true;
                }
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
