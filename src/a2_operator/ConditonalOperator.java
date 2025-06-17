package a2_operator;

public class ConditonalOperator {
    public static void main(String[] args) {
        // 삼항연산자
        // 간단한 조건문(조건식)
        // 예제) 짝수와 홀수를 구분하는 코드
        int number = 2;
        // if문을 사용한 예
        if (number % 2 == 0){
            System.out.println("짝수");  // 참(true)
        }else {
            System.out.println("홀수");  // 거짓(false)
        }
        // if문을 사용한 예
        if (true){
            System.out.println("짝수");  // 참(true)
        }else {
            System.out.println("홀수");  // 거짓(false)
        }
        // 삼항연산자를 사용한 예
        System.out.println((number%2==0) ? "짝수" : "홀수"); // (number%2==0)조건이면 ?참이면 /거짓이면
        System.out.println("짝수");
        System.out.println("홀수");

        int value1 = (3>5) ? 6 : 9; // (3>5)이면 /거짓이므로 9
        System.out.println(value1); // 9

        int value2 = (5>3) ? 10 : 20; // (5>3)이면 ?참이므로 10
        System.out.println(value2); // 10



    }
}
