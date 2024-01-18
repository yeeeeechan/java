package _03_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요.");

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            result += arr[i];
        }

        System.out.println("평균은 " + (double) result / arr.length); // 강제 형 변환
        sc.close();
    }
}
