package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassPracSol {
    private int width;
    private int height;

    private static int count = 0;


    // 메소드
    public ClassPracSol(int width) {
        // 지역변수랑 필드 변수명이 동일하기 때문에 this 사용해서 필드 값에 접근
        this.width = width;
        count++; // 새로운 rectangle 인스턴스가 생성될 때마다 개수 증가
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    static int getCount() {
        return count;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        // 객체를 담는 ArrayList 생성
        ArrayList<ClassPracSol> rectangles = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 가로와 세로를 입력받아 ArrayList에 Rectangle 인스턴스 차례로 추가
        while (true) {
            System.out.println("가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요: ");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if (width == 0 && height == 0) {
                break;
            }

            // 클래스에서 생성했을 때 위의 생성자가 실행됨
            ClassPracSol rectangle = new ClassPracSol(width);
            rectangle.setHeight(height); // 세로 길이 설정

            // ArrayList에 rectangle 객체 추가
            rectangles.add(rectangle);

            // 입력된 rectangle 객체들의 정보 출력
            System.out.println("입력된 Rectangle 정보");

            // 반복문을 통해 ArrayList 출력
            for (ClassPracSol rec : rectangles) {
                System.out.println("가로 길이는: " + rec.getWidth());
                System.out.println("세로 길이는: " + rec.getHeight());
                System.out.println("넓이는: " + rec.area());
                System.out.println("================================");
            }
            System.out.println("Rectangle 인스턴스의 개수는: " + getCount());
        }
        scanner.close();
    }
}
