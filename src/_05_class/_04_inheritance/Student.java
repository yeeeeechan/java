package _05_class._04_inheritance;

public class Student extends Person {
    // Case 1. 필드가 public인 경우

//    public String campus;
//
//    public Student(String name, int age) {
//        // 2-1. 부모 클래스가 기본 생성자
//        // super(); // 생략되어 있음! 자식 클래스를 만들 때 부모 클래스(기본 생성자)를 먼저 생성함 (컴파일 시 자동 추가)
//        // 부모 클래스의 생성자가 매개변수를 필요로 할 경우, super()에 매개변수를 넘겨줘야 함
////        this.name = name;
////        this.age = age;
//
//        // 2-2. 부모 클래스가 매개변수를 갖는 생성자
//        super(name, age);
//        System.out.println("자식 클래스 Student(name, age) 생성자 실행!");
//    }
//
//    public void setCampus(String campus) {
//        this.campus = campus;
//        System.out.println(campus + " 캠퍼스에서 공부 중");
//    }

    /////////////////////////////////////
    // Case 2. 필드가 private인 경우
    private String campus;

    public Student(String name, int age) {
        // 부모로부터 상속받은 필드값 채워주기 (private는 this.으로 접근 불가)
        setName(name);
        setAge(age);
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
        System.out.println(campus + " 캠퍼스에서 공부 중");
    }

    // 오버라이딩 - 부모 클래스의 메소드를 자식 클래스에서 재정의
    // 메소드 이름, 매개변수 타입 및 개수, 리턴 타입 등은 모두 동일하게
    @Override // 어노테이션(생략 가능함)
    public void say() {
        System.out.println("안녕! 222222");
    }
}
