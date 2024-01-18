package _02_controll_statement;

public class LoopControl {
    public static void main(String[] args) {
        // 기본 for문
        for (int i = 0 ; i < 10 ; i++) {
            System.out.print(i + " ");
        }

        // while 문
        // 조건식이 참인 동안 while 블럭 실행
        System.out.println("==================");
        int i = 1;
        while (i <= 10) {
            System.out.print(i);
            i++;
        }
        
        // do-while 문
        // 적어도 한 번은 수행되는 반복문 (조건이 거짓이더라도)
        // while 문과 다르게 조건식이 뒤에 배치됨
        System.out.println("====================");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while(j <= 10);

        // for ~ each 문
        // collection type: 데이터를 저장하고 관리하는 자료 구조를 제공하는 클래스 모음
        // collection 타입 데이터에서 데이터의 개수만큼 반복 실행
        // ex. List, Set, Map, Stack, Vector 등등
        System.out.println("=======================");
        String[] array = {"A", "B", "C"};
        for (String a : array) {
            System.out.println("a = " + a);
        }
    }
}
