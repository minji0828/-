package mission.mission02;
import java.util.Scanner;

public class sang2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("피라미드 높이를 입력하세요: ");
            int n = sc.nextInt();  // 사용자로부터 층수 입력

            printPyramid(n);       // 피라미드 출력 메서드 호출
        }

        // 피라미드를 층별로 출력하는 메서드
        public static void printPyramid(int n) {
            for (int i = 1; i <= n; i++) {           // 층 반복
                // 공백 출력
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // 별 출력
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                // 줄바꿈
                System.out.println();
            }
        }
    }


