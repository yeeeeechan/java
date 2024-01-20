package _04_exception;

// 예외
// - 일반 예외 (Exception): 컴파일러가 예외 처리 코드 여부를 검사하는 예외
// - 실행 예외 (Runtime Exception): 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외

// -> Java는 예외가 발생하면 예외 클래스로부터 객체를 생성하며, 해당 객체는 예외 처리 시 사용됨
// 예외 발생 시 프로그램의 갑작스러운 종료를 막고, 정상 실행할 수 있도록 처리하는 코드를 예외 처리 코드라고 함
// try-catch-finally 블록으로 처리

import java.util.InputMismatchException;
import java.util.Scanner;

// try 블록에서 작성한 코드가 예외 없이 정상 실행됨 -> catch 실행 안 됨, finally 실행
// try 블록에서 작성한 코드에서 예외가 발생함 -> catch 실행, finally 실행
// 심지어 try 블록과 catch 블록에서 return 문을 사용해도 finally는 항상 실행된다. (finally는 생략 가능)
public class ExceptionEx {
    public static String divide(int x, int y) {
        return x + " / " + y + " = " + (x / y);
    }

    public static int getLength(String str) {
        return str.length();
    }

    public static int getValueByIdx(int[] arr, int idx) {
        return arr[idx];
    }

    public static void main(String[] args) {
        // case 1. 예외 발생 코드
        // System.out.println(divide(6, 0)); // java.lang.ArithmeticException

        // case 1. 예외 처리 코드
//        try {
//            System.out.println("*** 연산 시작!");
//            System.out.println(divide(6, 0));
//        } catch (ArithmeticException e) {
//            // 예외 출력 방법
//            // 방법 1: e.getMessage()는 예외가 발생한 이유만 보여줌
//            System.out.println("나누기 중 에러 발생 >> " + e.getMessage()); // / by zero
//
//            // 방법 2: 예외 종류까지 함께 리턴
//            System.out.println("나누기 중 에러 발생 >> " + e.toString()); // java.lang.ArithmeticException: / by zero
//
//            // 방법 3: 예외가 어디서 발생했는지 추적한 내용을 출력(확인용으로 사용)
//            // e.printStackTrace();
//
//        } finally {
//            System.out.println("*** 연산 종료!");
//        }

        //////////////////////////////////
        // case 2. 예외 발생 코드
//        System.out.println("단어 길이: " + getLength(null)); // java.lang.NullPointerException

        // case 2. 예외 처리 코드
        try {
            System.out.println("단어 길이: " + getLength(null));
        } catch (NullPointerException e) {
            System.out.println("단어 길이 연산 중 에러 발생 >> " + e.toString());
        }

        /////////////////////
        // case 3. 예외 발생 코드
        int[] numbers = {10, 20, 30, 40, 50};
//        System.out.println(getValueByIdx(numbers, numbers.length)); // java.lang.ArrayIndexOutOfBoundsException

        // case 3. 예외 처리 코드
        try {
            System.out.println(getValueByIdx(numbers, numbers.length));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱싱 중 에러 발생 >> " + e.toString());
        }

        /////////////////////////////
        // case 4.
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("정수를 입력하세요. : ");
            int number = scanner.nextInt();
            System.out.println("입력한 정수 : " + number);
        } catch (InputMismatchException e) {
            // 정수 이외의 값이 입력되면 에러 발생
            System.out.println("InputMismatchException 발생: " + e.toString());
        }
    }
}
