package ReflectDemo;

public class Student {
    private String name;
    private int age;
    public String name1;
    public int age2;
    public String gender;
    private int money = 300;


    public Student() {
        System.out.println("无参构造");
    }

    private Student(String name) {
        System.out.println("name的值:" + name);
    }

    public Student(String name, int age) {
        System.out.println("name的值为" + name + "age的值为" + age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", name1='" + name1 + '\'' +
                ", age2=" + age2 +
                ", gender='" + gender + '\'' +
                ", money=" + money +
                '}';
    }
}
