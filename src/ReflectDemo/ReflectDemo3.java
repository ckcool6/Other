package ReflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //method1();
        //method2();
        //method3();
        //method4();
    }

    private static void method() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Student student = (Student) constructor.newInstance("lisi");
        System.out.println(student);
    }

    private static void method3() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Student student = (Student) aClass.newInstance();
        System.out.println(student);
    }

    private static void method2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Constructor<?> constructor = aClass.getConstructor();
        Student student = (Student) constructor.newInstance();
        System.out.println(student);
    }

    private static void method1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        Student student = (Student) constructor.newInstance("lisi", 12);
        System.out.println(student);
    }
}
