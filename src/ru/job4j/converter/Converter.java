package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int expected = 2;
        boolean passed = expected == euro;
        System.out.println("140 rubles are 2 euro, result: " + passed);
        int dollar = Converter.rubleToDollar(120);
        int expected2 = 2;
        boolean passed2 = expected2 == dollar;
        System.out.println("120 rubles are 2 dollars, result: " + passed2);
    }
}
