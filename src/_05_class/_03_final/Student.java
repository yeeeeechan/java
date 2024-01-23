package _05_class._03_final;

import java.util.Stack;

public class Student {
    // final 필드
    final String campus = "용산"; // 1. 필드 선언 시 초기화하기
    final String sid; // 2. 생성자에서 초기화하기

    public Student(String sid) {
        this.sid = sid;
    }

    public static void main(String[] args) {
        Student std1 = new Student("s001");
        System.out.println(std1.campus);
        System.out.println(std1.sid);
    }
}
