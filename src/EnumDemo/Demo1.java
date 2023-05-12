package EnumDemo;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println(Season.SPRING);
        Season spring = Season.SPRING;
        String name = Season.SPRING.name();
        System.out.println(Season.WINTER.ordinal());
        System.out.println(Season.WINTER.compareTo(Season.AUTUMN));
        System.out.println(Season.SPRING.toString());
        Season spring1 = Enum.valueOf(Season.class, "SPRING");
        System.out.println(spring1);
        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));
        for (Season value : values) {
            System.out.println(value);
        }

    }
}
