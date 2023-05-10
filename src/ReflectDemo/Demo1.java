package ReflectDemo;

public class Demo1 {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader classLoader = systemClassLoader.getParent();
        ClassLoader classLoader1 = classLoader.getParent();

        System.out.println(systemClassLoader);
        System.out.println(classLoader);
        System.out.println(classLoader1);
    }
}
