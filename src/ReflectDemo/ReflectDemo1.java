package ReflectDemo;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1
        Class<?> aClass = Class.forName("ReflectDemo.Demo1");
        System.out.println(aClass);

        //2
        Class<Demo1> demo1Class = Demo1.class;
        System.out.println(demo1Class);

        //3
        Demo1 demo1 = new Demo1();
        Class<? extends Demo1> aClass1 = demo1.getClass();
        System.out.println(aClass1);

    }
}
