package _03_array;

// Collection Framework
// : 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스 & 클래스를 java.util에 포함시켜 둔 것.

// List
// ㄴ ArrayList

// Set
// ㄴ HashSet
// ㄴ TreeSet

// Map
// ㄴ HashMap
// ㄴ HashTable
// ㄴ TreeMap 등등이 있음

// ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용하는 컬렉션
// - 표준 배열보다는 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우에 유용하게 사용할 수 있다.
// - 일반 배열과 달리 크기를 미리 지정하지 않아도 된다. (동적 할당)
// - List 컬렉션은 객체 자체를 저장하는 게 아니라, 객체의 주소값을 저장한다.
//  -> 동일한 객체를 중복 저장할 수도 있다.(동일한 번지 수가 저장된다는 의미) 따라서 null도 가능


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
        // 1. ArrayList 생성 (정수형)
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // 3. 요소 접근
        System.out.println("첫 번째 요소: " + numbers.get(0)); // 10

        // 4. 요소 수정
        numbers.set(1, 99);
        System.out.println("numbers : " + numbers); // [10, 99, 30] (이름으로 전체 값 출력 가능)

        // 5. 요소 삽입 (지정된 위치)
        numbers.add(1, 7);
        System.out.println("numbers : " + numbers); // [10, 7, 99, 30]

        // 6. ArrayList끼리 연결
        System.out.println(Arrays.asList(11, 44, 55, 99)); // [11, 44, 55, 99]
        numbers.addAll(Arrays.asList(11, 44, 55, 99));
        System.out.println("numbers: " + numbers); // [10, 7, 99, 30, 11, 44, 55, 99]

        // 7. 요소 위치 찾기
        System.out.println(numbers.indexOf(55));

        // 8. 요소 삭제
        numbers.remove(6);
        System.out.println("numbers : " + numbers); // [10, 7, 99, 30, 11, 44, 99]

        // 9. 리스트 크기 확인
        System.out.println("리스트 크기 : " + numbers.size()); // 7

        // 10. 모든 요소 출력
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }

        // 11. 모든 요소 삭제
        numbers.clear();
        System.out.println("numbers: " + numbers); // []

        /////////////////////////////////////

        // Student 타입의 ArrayList 생성
        ArrayList<Student> students = new ArrayList<>();

        // 바로 값 넣기
        students.add(new Student("Rose", 17));
        students.add(new Student("Lisa", 21));
        students.add(new Student("Lily", 11));

        // 변수 선언해서 넣기
        Student std1 = new Student("Jennie", 14);
        students.add(std1);

        System.out.println("students :" + students);
        System.out.println("학생 수 : " + students.size());

        Student std = students.get(0); // 0번 학생 확인
        System.out.println(std.getName() + " 학생의 나이는 " + std.getage() + "세입니다.");

        // 반복문 이용
        System.out.println("=== 학생 명단 ===");
        for (Student student : students) {
            System.out.println(student.getName() + " (" + student.getage() + ")");
        }

        // System.out.println(Arrays.toString(array 배열);
        System.out.println(Arrays.toString(students.toArray())); // String 이므로 주소값이 반환됨
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getage() {
        return age;
    }
}