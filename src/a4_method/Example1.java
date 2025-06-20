package a4_method;

public class Example1 {
    public static void main(String[] args) {
        // 문자열의 길이를 반환하는 메서드
        String str = "Hello";
        int length = getLength(str); // 매개변수로 변수를 전달(복사)
        System.out.println(length);

        length = getLength("이 문장은 몇글자일까"); // 매개변수에 문자열 직접 입력
        System.out.println(length);   // println은 매서드이다.

        System.out.println(getLength("Happy Life"));
    }
    public static int getLength(String str) {
        return str.length();
    }

}
