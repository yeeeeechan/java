package _02_controll_statement;

import java.util.Scanner;

public class Practice_method {
    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("덧셈 결과 :" + sum(number1, number2));
        System.out.println("뺄셈 결과 :" + minus(number1, number2));
        System.out.println("나눗셈 결과 :" + divide(number1, number2));
        System.out.println("곱셈 결과 :" + mul(number1, number2));

        Practice_method ol = new Practice_method();

        System.out.println("원의 넓이 " + ol.cal(5));
        System.out.println("직사각형 넓이 " + ol.cal(4, 7));
        System.out.println("삼각형 넓이" + ol.cal(6.0, 3.0));

        sc.close();
    }

    public double cal(double a) {
        return a * a * Math.PI;
    }

    public int cal(int a, int b) {
        return a * b;
    }

    public double cal(double a, double b) {
        return a * b / 2;
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {
        return x - y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }
}
