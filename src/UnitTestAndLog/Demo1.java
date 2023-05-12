package UnitTestAndLog;

import org.junit.Test;

public class Demo1 {
    public static void main(String[] args) {

    }

    @Test
    public void add() {
        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println(sum);
    }

    @Test
    public void show() {
        System.out.println("hello,world");
    }

}
