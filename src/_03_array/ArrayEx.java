package _03_array;

// 표준 배열
// 배열
// - 배열에 저장할 자료형을 선언하고, 배열 이름과 크기를 선언해야 함
// - 배열의 원소는 모두 같은 타입
// - 처음 선언한 배열 크기 변경은 불가능(단, ArrayList 컬렉션의 경우, 동적으로 크기 조절이 가능함)

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 변수 선언
        // - 두 가지 방법이 있으나, 관례상 첫 번째 방법을 주로 사용
        // 1. 타입[] 변수;
        // 2. 타입 변수[];
        int[] arr1;
        int arr2[];

        // - 배열 변수는 "참조형 변수", 배열도 객체이므로 힙 영역에 생성되고, 배열 변수는 힙 영역의 주소를 저장하는 것.
        // null 값 저장 가능(null로 초기화)
        // ex. 타입[] 변수 = null;
        // -> 단, 배열 변수가 null 값을 가진 상태에서는 변수[인덱스]로 값을 읽거나 저장하게 되면 에러 발생("NullPointerException" 발생)
        String[] temp = null;
        System.out.println(temp); // 출력 결과 null
        // System.out.println(temp[0]); // 에러 발생

        // - 값의 목록으로 배열 변수 선언과 배열 생성하기
        int[] intArray = {1, 2, 3};
        System.out.println("intArray[0]: " + intArray[0]); // 인덱스로 접근 가능
        System.out.println("intArray: " + intArray); // intArray가 갖고 있는 참조값이 출력됨

        intArray[1] = 77; // 인덱스 1번 항목 값 변경
        System.out.println("intArray[1]: " + intArray[1]);

        // 주의! 중괄호로 감싼 목록을 배열 변수에 대입할 때, 배열 변수를 미리 선언한 수에는 값 목록을 변수에 대입할 수 없다.
        char[] charArray;
        // charArray = {'A', 'B', 'C'}; // 컴파일 에러

        // 배열 변수 선언 시점과 값 목록을 대입하는 시점이 다르다면, "new 타입[]"을 중괄호 앞에 붙여서 대입해야 한다.
        charArray = new char[]{'A', 'B', 'C'};
        System.out.println("charArray[0]: " + charArray[0]);

        // 처음부터 new 연산자로 배열 선언과 배열 생성
        // : new 연산자로 배열을 처음 생성하면, 배열 항목은 기본값으로 초기화된다.
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화된 값: " + doubleArray[0]);
        doubleArray[0] = 0.1;
        doubleArray[1] = 1.2;
        doubleArray[2] = 3.54;

        System.out.println("doubleArray[0]: " + doubleArray[0]);
        System.out.println("doubleArray[1]: " + doubleArray[1]);
        System.out.println("doubleArray[2]: " + doubleArray[2]);

        ////////////////////////////////////////////////////
        // 배열 길이
        // - 배열 변수.length;
        // - length 필드는 읽기만 가능하고, 값 변경은 불가능하다.
        System.out.println("doubleArray length: " + doubleArray.length);

        // - 배열 길이를 벗어나면? 에러 발생
        // System.out.println(doubleArray[doubleArray.length]);

        /////////////////
        // 배열 출력
        // - toString(): 배열 내용을 문자열로 변환하여 반환
        // - 배열 이름으로 배열 주소값이 아닌 배열 내부 값을 모두 보고 싶을 때
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("charArray: " + Arrays.toString(charArray));
        System.out.println("doubleArray: " + Arrays.toString(doubleArray));

        /////////////////////////
        // 다차원 배열
        // - 배열 안에 또다른 배열이 존재하는 배열을 뜻함
        // 2 x 3 배열 생성 및 초기화하기
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        // 3 x 2 배열 생성 및 초기화
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;

        // 3차원 배열 생성 및 초기화
        int[][][] threeDimensionArr = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        System.out.println("matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            // (0,0) (0,1) (0,2)
            // (1,0) (1,1) (1,2)
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // matrix2
        System.out.println("matrix2: ");
        for (int i = 0; i < matrix2.length; i++) {
            // (0,0) (0,1) (0,2)
            // (1,0) (1,1) (1,2)
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // 3차원 배열의 값 출력
        System.out.println("threeDimensionArr: ");
        for (int i = 0; i < threeDimensionArr.length; i++) {
            // (0,0) (0,1) (0,2)
            // (1,0) (1,1) (1,2)
            for (int j = 0; j < threeDimensionArr[i].length; j++) {
                for (int k = 0; k < threeDimensionArr[i][j].length; k++) {
                    System.out.print(threeDimensionArr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        /////////////////////////////////////
        // 배열 복사
        // - 배열은 크기가 고정되어 있음
        // -> 더 많은 저장 공간이 필요하다면, 더 큰 길이의 배열을 새로 만들어서 기존 배열을 복사하는 방법을 쓸 수 있음

        // ver 1. 반복문으로 요소 하나씩 복사하기
        int[] originArray = {1, 2, 3};
        int[] newArray = new int[5];

        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        System.out.println(Arrays.toString(newArray)); // 출력 결과 [1, 2, 3, 0, 0]

        // ver 2. arraycopy() 사용하기
        // : System.arraycopy(Object src, int scrPos, Object dest, int destPos, int length); 의 구조
        // - Object src: 원본 배열
        // - int scrPos: 원본 배열의 복사 시작 인덱스
        // - Object dest: 새 배열
        // - int destPos: 새 배열을 붙여넣기 시작할 인덱스
        // - int length: 복사할 항목 수

        String[] originFruits = {"apple", "banana", "kiwi"};
        String[] newFruits = new String[5];

        System.arraycopy(originFruits, 0, newFruits, 0, originFruits.length);
        System.out.println(Arrays.toString((newFruits))); // 출력 결과 [apple, banana, kiwi, null, null]

        // System.arraycopy(originFruits, 1, newFruits, 1, originFruits.length - 2);
        // System.out.println(Arrays.toString((newFruits)));

        // Arrays 메소드
        // copyOf(arr, copyArrLength) 메소드
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = Arrays.copyOf(originalArray, 3);
        System.out.println("originalArray: " + Arrays.toString(originalArray));
        System.out.println("copiedArray: " + Arrays.toString(copiedArray)); // [1, 2, 3]

        // copyOfRange(arr, startIdx, endIdx) 메소드
        int[] rangeArray = Arrays.copyOfRange(originalArray, 1, 4);
        System.out.println("rangeArray: " + Arrays.toString(rangeArray)); // [2, 3, 4]

        // fill(arr, n) 메소드
        int[] filledArray = new int[5];
        System.out.println("filled Array (before): " + Arrays.toString(filledArray));
        Arrays.fill(filledArray, 7);
        System.out.println("filled Array (after): " + Arrays.toString(filledArray));

        // sort(arr) 메소드 (오름차순 정렬)
        int[] unsortedArray = {2, 10, 1, 6, 4};
        Arrays.sort(unsortedArray);
        System.out.println("SortedArray: " + Arrays.toString(unsortedArray));

        String[] unsortedArray2 = {"L", "B", "A", "Y"};
        Arrays.sort(unsortedArray2);
        System.out.println("SortedStringArray: " + Arrays.toString(unsortedArray2));

        // equals(arr1, arr2) 메소드
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 5, 3};

        boolean arraysEqual = Arrays.equals(array1, array2);
        boolean arraysEqual2 = Arrays.equals(array1, array3);

        System.out.println("Arrays Equal (1 vs 2): " + arraysEqual); // true
        System.out.println("Arrays Equal (1 vs 3): " + arraysEqual2); // false

        // == 비교할 때
        // 주소값을 참조하기 때문에 내용물이 같더라도 false가 나옴
        System.out.println("Arrays == (1 vs 2): " + (array1 == array2)); // false
        System.out.println("Arrays == (1 vs 3): " + (array1 == array3)); // false

        // deepEquals(arr1, arr2) 메소드
        int[][] deepArray1 = {{1, 2}, {3, 4}};
        int[][] deepArray2 = {{1, 2}, {3, 4}};
        int[][] deepArray3 = {{1, 2}, {7, 4}};

        boolean deepArraysEqual = Arrays.deepEquals(deepArray1, deepArray2);
        boolean deepArraysEqual2 = Arrays.deepEquals(deepArray1, deepArray3);

        System.out.println("Deep Arrays Equal (1 vs 2): " + deepArraysEqual); // true
        System.out.println("Deep Arrays Equal (1 vs 3): " + deepArraysEqual2); // false

        // binarySearch(arr, val) 메소드 (단, 배열이 정렬된 상태여야 함)
        // 해당하는 요소의 인덱스 값 출력
        int[] sortedArray = {10, 20, 30, 40, 50, 90};
        int index = Arrays.binarySearch(sortedArray, 30);
        System.out.println("index of 30: " + index);
    }
}
