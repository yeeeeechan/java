package _02_controll_statement;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // 두 개 이상의 조건을 넣을 때는 AND 연산자로 연결해서 사용
        if (1 <= age && age <= 7) {
            System.out.println("유아");
        } else if (8 <= age && age <= 13) {
            System.out.println("초등학생");
        } else if (14 <= age && age <= 16) {
            System.out.println("중학생");
        } else if (17 <= age && age <= 19) {
            System.out.println("고등학생");
        } else if (20 <= age) {
            System.out.println("성인");
        } else {
            System.out.println("입력 값을 다시 확인해 주세요.");
        }

        System.out.println("이름을 입력하세요.");
        String name = sc.next();

        String result;
        result = switch (name) {
            case "홍길동" -> "남자";
            case "성춘향" -> "여자";
            default -> "모르겠어요.";
        };
        System.out.println(result);

        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();

        int i = 1;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        ;
        sc.close();
    }
}
