package ReflectDemo;

import java.lang.reflect.Field;

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        //method1();
        //method2();
    }

    private static void method2() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Field field = aClass.getDeclaredField("money");
        field.setAccessible(true);
        Student student = (Student) aClass.newInstance();
        Object o = field.get(student);
        System.out.println(o);
    }

    private static void method1() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");

        Field field = aClass.getField("name1");

        Student student = (Student) aClass.newInstance();
        field.set(student, "zhangsan");
        System.out.println(student);
    }
}
