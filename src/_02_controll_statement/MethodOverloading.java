package _02_controll_statement;

import java.lang.constant.MethodTypeDesc;

// 오버로딩
// 하나의 클래스에서 동일한 이름의 메소드 여러 개를 정의하는 것
// 즉, 이름이 같고 매개변수의 타입 or 개수 or 순서가 다른 메소드 여러 개
// 동작이 유사할 때 사용하면 편리함
public class MethodOverloading {
    public static void main(String[] args) {
        // 오버로딩 사용할 때
        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체의 메소드 사용
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(1.1, 2.2)); // 부동 소수점의 한계 -> BigDecimal 클래스를 이용해서 계산
        System.out.println(ol.add(3, 4, 5));
        System.out.println(ol.add(1.2, 3.3, 2.2));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }
}
