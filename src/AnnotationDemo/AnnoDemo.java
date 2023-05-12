package AnnotationDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnoDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("AnnotationDemo.Father");
        Father father = (Father) aClass.newInstance();

        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Test1.class)) {
                declaredMethod.invoke(father);
            }
        }
    }
}
