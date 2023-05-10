package ReflectDemo;

import java.lang.reflect.Field;

public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //method1();
        //method2();
        //method3();
        //extracted();
    }

    private static void extracted() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Field field = aClass.getDeclaredField("money");
        System.out.println(field);
    }

    private static void method3() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Field field = aClass.getField("name1");
        System.out.println(field);
    }

    private static void method2() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    private static void method1() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
