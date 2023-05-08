package Enums;

import java.util.Arrays;

public class TestEnums {
    public static void main(String[] args) {

        Color red = Color.RED;
        System.out.println(red);
        Color blue = Color.BLUE;
        System.out.println(blue);
        System.out.println(Color.GREEN);
        System.out.println(Color.YELLOW);

        Color[] values = Color.values();
        System.out.println(Arrays.toString(values));

        MyDay myDay = MyDay.TUESDAY;
        dayIsNice(myDay);
        dayIsNice(myDay.FRIDAY);

        red.someMethod();
        blue.someMethod();

        red.specialMethod();
        blue.specialMethod();

        // Невозможно явно вызвать конструктор

    }

    public static void dayIsNice(MyDay day) {
        switch (day) {
            case MONDAY -> System.out.println("bad");
            case FRIDAY -> System.out.println("better");
            case SATURDAY, SUNDAY -> System.out.println("best");
            default -> System.out.println("so-so");
        }
    }

}
