package _05_class._02_static;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Student {

    // 1. 필드 정의
    private String name;
    private int student_ID;
    private int grade;

    // 클래스 변수(static) 총 학생 수
    private static int totalStudent;

    // 생성자
    public Student(String name, int id, int grade) {
        // 생성자로 이름, 학번, 학년 초기화 (+ totalStudent 증가까지)
        this.name = name;
        this.student_ID = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public static void setTotalStudent(int totalStudent) {
        Student.totalStudent = totalStudent;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentsInfo = new ArrayList<>();

        while (true) {
            System.out.println("학생 정보(이름, 학번, 학년)를 입력하세요.");
            String name = sc.next();
            int id = sc.nextInt();
            int grade = sc.nextInt();

            Student studentInfo = new Student(name, id, grade);

            studentsInfo.add(studentInfo);
            Student.totalStudent++;

            if (name.equals(" ") || id == 0 || grade == 0) {
                break;
            }

            for (Student i : studentsInfo) {
                System.out.println("===== 학생 정보 =====");
                System.out.println("이름: " + i.name);
                System.out.println("학번: " + i.student_ID);
                System.out.println("학년: " + i.grade);
            }
            System.out.println("총 학생 수는 " + getTotalStudent() + "명입니다.");
        }
    }
}
