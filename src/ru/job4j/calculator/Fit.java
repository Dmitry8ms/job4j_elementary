package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100.0) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110.0) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 186;
        double man = Fit.manWeight(height);
        System.out.println("Best weight for man 186cm height is " + man + "kg");
        short height2 = 172;
        double woman = Fit.womanWeight(height2);
        System.out.println("Best weight for woman 172cm height is " + woman + "kg");
    }
}
