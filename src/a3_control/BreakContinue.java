package a3_control;

public class BreakContinue {
    public static void main(String[] args) {
        // 제어키워드
        // break
        // switch,for,while,do~while {}를 탈출하는 용도로 사용함. (if는 제외)
        // 중요! 가장 가까운 {} 한개만 탈출 가능

        // 기본형
        for (int i=0; i<10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for (int z=0; z<10; z++) {
            System.out.print(z + " ");
            if (z == 5) {
                break;
            }
        }
        System.out.println();
        for (int y=0; y<10; y++) {
            System.out.print(y + " ");
            if (y == 5) {
                break;
            }
            System.out.print(y + " ");
        }
        System.out.println();

        // 이중 for문 (double loop)
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("i=" + i + ", j=" + j); // i=?, j=?
            }
        }
        System.out.println();
        // 이중 for문을 한번에 탈출하는 코드 (tip)
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                if (j == 2) {
                    i = 99999; // 바깥loop의 조건을 강제로 false로 바꿈!!!
                    break;
                }
                System.out.println("i=" + i + ", j=" + j); // i=?, j=?
            }
        }

        // continue
        // 반복문안에서 현재 반복을 건너뛰고 다음 반복으로 넘어가도록 함
        // 핵심은 continue가 선언된 위치의 아래쪽 코드를 실행하지 않는 것!!
        for (int i=0; i<10; i++) {
            if (i == 5){
                continue;
            }
            System.out.print(i + " "); // 0 1 2 3 4 6 7 8 9
        }
        System.out.println();
    }
}







