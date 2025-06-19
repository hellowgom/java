package a3_control;
import java.util.Scanner; // 외부라이브러리를 사용하려면 먼저 import해야 함!!

public class IfElse {
    public static void main(String[] args) {
        // if 조건문(선택제어문)
        int a = 10;
        // if문의 기본형태1 : if() {}
        if (a>5) { //조건이 거짓이면 실행되는 코드가 없음
            System.out.println(a);
        }
        // if문의 기본형태2 : if() {} else {}
        if (a>5) {
            System.out.println(a);
        }else {
            System.out.println("조건은 거짓");
        }
        // if문의 기본형태3 : if() {} else if() {} else {}
        // 나이를 입력하면 연령대를 출력하는 조건문
        // 나이 입력을 동적(=유저입력)으로 하기 위해 외부라이브러리가 필요함!
        Scanner scanner = new Scanner(System.in); // Scanner는 (외부)class이다. scanner는 변수이다. (모든)변수는 스택에만들어짐.
        System.out.println("나이를 입력해주세요: ");
        int userAge = scanner.nextInt();
        if (userAge >= 20 && userAge <= 29) {
            System.out.println("20대");
        }
        else if (userAge >= 30 && userAge <= 39) {
            System.out.println("30대");
        }
        else if (userAge >= 40 && userAge <= 49) {
            System.out.println("40대");
        }
        else {
            System.out.println("나머지");
        }
        scanner.nextLine(); // Scanner가 가지고 있는 엔터버퍼를 비워주는 역할

        // 이름 입력
        System.out.println("이름을 입력해주세요: ");
        String userName = scanner.nextLine();
        System.out.println(userName);
        System.out.println("끝");
        scanner.close(); // 스캐너 객체를 메모리에서 삭제시킴
        // 참조자료형이 생성되는 Heap메모리의 경우, 필요없는 메모리는 삭제하자!
        // 남아있으면 GC(Garbage Collector)에 의해 자동으로 삭제되지만,
        // 코드상에서 명시적으로 삭제시키는 것이 좋은 습관임.

        // if문의 중복
        int value1 = 5;
        int value2 = 3;
        if (value1 > 4) {
            if (value2 < 2) {
                System.out.println("실행1");
            }else {
                System.out.println("실행2");
            }
        }else {
            System.out.println("실행3");
        }

        // if문의 code drilling 이슈
        if(true) {
            if (true) {
                if (true) {
                    if (true) {
                        if (true) {
                            // 가독성을 떨어뜨리므로 좋지 않은 코딩방법
                        }
                    }
                }
            }
        }
    }
}
