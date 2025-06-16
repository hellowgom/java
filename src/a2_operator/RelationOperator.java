package a2_operator;

public class RelationOperator {
    public static void main(String[] args) {
        // 비교연산자 (<, >, <=, >=, ==, !=)
        // 비교연산자의 특징
        // 반드시 그 결과가 참 또는 거짓으로 나오는 연산자.
        System.out.println(5<2); // false
        System.out.println(5>2); // true
        System.out.println(5<=5); // true
        System.out.println(5>=5); // true
        // System.out.println(5=>5); 에러, 기호 순서 잘못씀.
        System.out.println();

        // 변수를 이용한 비교연산자 표현
        int a = 5;
        int b = 2;
        int c = 5;

        System.out.println(a==b); // false
        System.out.println(a!=b); // true
        System.out.println(a==c); // true
        System.out.println(a!=c); // false
        // !(negation, NOT)기호는 == 의 반대임
        System.out.println();

        // 중요!! 참조자료형의 참조비교
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str1); // true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        String str10 = new String("hello");  // 힙에 Hellow 저장
        String str11 = new String("Hello");  // 힙에 Hellow 저장
        System.out.println(str10 == str11); // false
        System.out.println(str10 == str10); // true
        System.out.println(str10.equals(str11)); // flase
        System.out.println(str10.equalsIgnoreCase(str11)); // true

        RelationOperator aaa = new RelationOperator();

        // 리터럴방식의 문자열 생성과 비교
        String str3 = "Hello";    // 메타페이스(리터럴영역)에 Hellow 저장
        String str4 = "Hello";    // 메타페이스(리터럴영역)에 Hellow 이미 저장되어 Hello 저장할 필요 없음
        System.out.println(str3 == str4);  // true

        // 참조값의 복사후 비교
        String str5 = new String("안녕");
        String str6 = str5;
        System.out.println(str5 == str6); // true


       // 모든 변수는 스택에 만들어진다.


    }
}
