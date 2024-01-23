//package _05_class._01_class;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//// 클래스 안에서 클래스라는 틀을 사용해 만든 것이 객체
//// 객체에서 클래스를 사용하기 위해 .으로 접근
//public class ClassPrac {
//    private int width;
//    private int height;
//
//    // 생성자
//    // 클래스를 생성할 때 자동으로 생성됨
//    public ClassPrac(int width) {
//        // 지역 변수와 필드 변수명이 동일하기 때문에, this 를 사용해서 필드값에 접근
//        this.width = width;
////        this.height = height;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해 주세요.");
//            int widthValue = scanner.nextInt();
//            int heightValue = scanner.nextInt();
//
//            if (widthValue == 0 && heightValue == 0) break;
//        }
//
//        // ClassPrac 안에서 reactangle 객체를 만듦
//        ClassPrac rectangle = new ClassPrac(widthValue);
//        rectangle.setWidth(widthValue);
//        rectangle.setHeight(heightValue);
//
//        ArrayList<ClassPrac> rect = new ArrayList<>();
//        rect.add(rectangle);
//
//
//        // 입력받은 값으로 ClassPrac 객체 생성( 이때 생성자에서 필요로 하는 값을 넘겨준다. )
////        ClassPrac area = new ClassPrac(width, height); // area는 ClassPrac의 인스턴스
////        area.area(width, height);
//
//        scanner.close();
//    }
//
//    // area 메소드
//    public void area() {
//        System.out.println("사각형의 넓이: " + (width * height));
//    }
//    // rectangle.area(width) -> 이런 식으로 메소드 사용
//}
