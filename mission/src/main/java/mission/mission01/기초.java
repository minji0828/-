package mission.mission01;

import java.util.Scanner;

public class 기초 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int plus = a + b;
        int minus = a - b;
        int division = a / b;
        double division1 = (double) a / b;
        double remain  = a % b;
        int multiply = a * b;

        System.out.println("더하기 결과 : " + plus);
        System.out.println("빼기 결과 : " + minus);
        System.out.println("정수 나누기 결과 : " + division);
        System.out.println("실수 나누기 결과 : " +  division1);
        System.out.println("실수 나누기의 나머지 결과 : " + remain);
        System.out.println("곱하기 결과 : " + multiply);

        sc.close();
    }
}

