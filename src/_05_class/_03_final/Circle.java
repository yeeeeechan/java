package _05_class._03_final;

import java.util.Scanner;

public class Circle {
    private final double radius;
    private static final double PI = 3.151592;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static double calculateArea(double radius) {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 반지름을 입력하세요.");
        
        double radius = sc.nextDouble();
        System.out.println("원의 반지름: " + radius);
        System.out.println("원의 넓이: " + Circle.calculateArea(radius));
    }
}
