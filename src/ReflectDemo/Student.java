package ReflectDemo;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造");
    }

    private Student(String name) {
        System.out.println("name的值:" + name);
    }

    public Student(String name, int age) {
        System.out.println("name的值为" + name + "age的值为" + age);
    }
}
