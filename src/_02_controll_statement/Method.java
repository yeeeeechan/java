package _02_controll_statement;

// 메소드: 객체가 갖는 기능(동작)

// 메소드 정의

/**
 * 접근제한자 리턴타입 메소드_이름(인자1, 인자2, ..) {
 * // 메소드 행위
 * return 반환값;
 * }
 */
public class Method {

    public static void main(String[] args) {
        int[] numbers = {10, 20};
        int[] numbers2 = {10, 20, 30, 40};

        hello();
        System.out.println(sum1(10, 20));
        System.out.println(sum2(10, 20));

        // 값 전달
        System.out.println(mul1(10, 20));

        // 참조 전달
        System.out.println(mul2(numbers));
        System.out.println(mul2(new int[]{10, 30})); // 배열을 생성해서 바로 값 넣기

        System.out.println(mul2(numbers2));
    }

    // 반환값이 없는 메소드
    public static void hello() {
        System.out.println("hello java!");
    }

    // 반환값이 있는 메소드
    // 반환값이 있을 때는 명시한 리턴타입과 return 에서 실제로 반환하는 데이터의 형식이 일치해야 함
    public static int sum1(int x, int y) {
        return x + y;
    }

    public static String sum2(int x, int y) {
        return "x + y = " + (x + y); // 문자열과 정수형이 더해져서 반환되므로, 반환값은 String
    }

    // call by value (값 전달)
    public static int mul1(int x, int y) {
        return x * y;
    }

    // call by reference (참조 전달)
    public static int mul2(int[] nums) {
//        return nums[0] * nums[1];
        // 배열 길이가 2보다 길 때
        int result = 1;
        for (int n : nums) {
            result *= n;
        }
        return result;
    }
}
