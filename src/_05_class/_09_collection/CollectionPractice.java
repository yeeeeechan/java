package _05_class._09_collection;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {
        // 콜렉션 연습 문제 2
        Map<String, Integer> map = new HashMap<>();
        System.out.println("이름과 나이를 입력하세요, '종료'를 입력하면 종료됩니다.");
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("이름 입력: ");
            String name = sc.next();

            if (name.equals("종료")) {
                break;
            }

            System.out.println("나이 입력: ");
            int age = sc.nextInt();

            // 이때 이름이 이미 존재하는 경우, 나이를 갱신(덮어씀)
            map.put(name, age);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        System.out.println("=== 입력받은 이름과 나이 목록 ===");
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String n = entry.getKey();
            Integer a = entry.getValue();
            System.out.printf("이름: %s, 나이: %d %n", n, a);
        }
        sc.close();

        // 콜렉션 연습 문제 1
//        Set<Integer> set = new HashSet<>();
//
//        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
//
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            int inputInt = sc.nextInt();
//
//            System.out.println("정수 입력: ");
//            set.add(inputInt);
//
//            if (inputInt == -1) {
//                break;
//            }
//        }
//        System.out.println("중복 제거된 정수 목록: " + set);
        // sc.close();
    }
}
