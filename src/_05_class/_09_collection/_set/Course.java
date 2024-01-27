package _05_class._09_collection._set;

public class Course {
    private int id;
    private String title;

    public Course(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // id, title 값이 같으면 동일한 hashCode 리턴함
    // 참고. hashCode란?
    // - hashCode: 객체의 메모리 주소를 기반으로 한 정수값을 해시 코드
    // - hashCode() 메소드: Object 클래스에 정의되어 있으며, 객체의 해시 코드를 반환하는 역할을 함
    // - 클래스에서 hashCode() 재정의: 객체의 내부 상태를 기반으로 한 고유한 해시 코드를 생성할 수 있다.

    @Override
    public int hashCode() {
        // title은 String이므로, hashCode() 메소드 사용
        // id는 int이므로, 정수값의 해시 코드에 더하기 연산
        return title.hashCode() + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course target) {
            // target은 Course의 객체

            // id는 int이므로, == 비교
            // title은 String이므로, equals 비교
            return target.id == id && target.title.equals(title);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Book{" + "title= '" + title + '\'' + ", id= '" + id + '\'' + "}";
    }
}
