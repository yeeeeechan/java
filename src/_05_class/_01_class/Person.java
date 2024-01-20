package _05_class._01_class;

public class Person {
    // 필드 (private)
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person codee = new Person();
        codee.age = 10; // 권장 X
        codee.setName("codee"); // 권장 O

        System.out.println(codee.age); // 권장 X
        System.out.println(codee.getName()); // 권장 O
    }
}
