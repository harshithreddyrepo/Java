package Enumeration.EnumDemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Arrays.toString(Day.values()));
        Day monday = Day.MONDAY;
        System.out.println(monday);
        System.out.println(monday.ordinal());
        Day enumDay = Day.valueOf("sunday");

    }
}
