package _01_basic_syntax;

// 형 변환: 데이터 타입을 변환하는 것
// (type)var 의 형태로 적는다.
// type 에는 데이터 유형, var 에는 변수 이름
public class Casting {
    public static void main(String[] args) {

        // 묵시적 형 변환 (Wider Conversion)
        // : 더 작은 타입에서 더 큰 타입으로의 자동 형 번환
        // : 반대의 경우, 묵시적 형 변환 불가능 > 명시적으로 반환해야 함
        int smallNumber = 10;
        double bigNumber = smallNumber; // int를 double로 자동 형 변환

        System.out.println("small: " + smallNumber);
        System.out.println("big: " + bigNumber);

        /////////////////////////////////////////
        // 명시적 형 변환(Narrow Conversion)
        // 더 큰 타입에서 더 작은 타입으로 강제 형 변환
        double anotherBig = 20.5;
        int anotherSmall = (int)anotherBig; // double을 int로 강제 형 변환시킴

        System.out.println("anotherSmall: " + anotherSmall);
        System.out.println("anotherBig: " + anotherBig);

        // 주의! 데이터 손실이 발생할 수 있는 경우가 있음 (형 변환하는 값의 차이가 너무 큰 경우엔 데이터 손실이 일어남)
        int largeNumber = 1000;
        byte smallByte = (byte) largeNumber;

        System.out.println("largeNumber: " + largeNumber);
        System.out.println("smallByte: " + smallByte);
    }
}
