package _04_exception;

import java.util.*;

public class ExceptionPractice {
    public static void main(String[] args) {
        // 실습 3
        Scanner sc = new Scanner(System.in);

        try {
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("배열 크기를 입력하세요.");
            int size = sc.nextInt();
            System.out.println("배열 요소를 입력하세요.");

            if (size <= 0) {
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }
            // 배열 생성
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // 실습 2
//        try {
//            System.out.println("배열 크기를 입력하세요.");
//            int size1 = sc.nextInt();
//
//            System.out.println("배열 요소를 입력하세요.");
//            int[] arr1 = new int[size1];
//
//            int sum = 0;
//
//            for (int i = 0; i < size1; i++) {
//                arr1[i] = sc.nextInt();
//                sum += arr1[i];
//            }
//
//            // 평균
//            double avg = (double) sum / size1;
//
//            System.out.println("총합은 " + sum + " 배열의 평균값은 " + avg);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스가 범위를 벗어났습니다.");
//        } catch (InputMismatchException e) {
//            System.out.println("정수 외의 값이 입력되었습니다.");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("배열 인덱싱 중 에러가 발생하였습니다.");
//        } finally {
//            sc.close();
//        }
//        ;
//
//        // 실습 1
//        try {
//            int[] arr = {1, 2, 3, 4};
//            printArray(arr, 5);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스가 범위를 벗어났습니다.");
//        }
//    }
//        }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}