package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int noWay = 0;
        int xWay = Math.abs(x2 - x1);
        int yWay = Math.abs(y2 - y1);
        if (xWay == yWay) {
            return xWay;
        }
        return noWay;
    }
}
