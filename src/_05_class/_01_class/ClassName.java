package _05_class._01_class;

public class ClassName {
    // 필드 (변수)
    public int number;
    public String name;

    // 생성자 -> 클래스명과 동일한 이름으로 만듦
    public ClassName() {

    }


    // 메소드 (함수)
    public void testMethod() {
        System.out.println("test method!");
        ;
    }

    public static void main(String[] args) {
        // 객체 생성 (인스턴스화)
        ClassName test = new ClassName();

        // 필드, 메소드 사용
        test.testMethod();
        System.out.println(test.name); // String은 null
        System.out.println(test.number); // int형은 0으로 초기화
    }
}
