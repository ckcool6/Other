package ReflectDemo;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //method1();
        //method2();
        //method3();
        //method4();
    }

    private static void method4() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
    }

    private static void method3() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Constructor<?> constructor = aClass.getConstructor();
        System.out.println(constructor);
    }

    private static void method2() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    private static void method1() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("ReflectDemo.Student");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
