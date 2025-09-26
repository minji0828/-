package com.ohgiraffers.missions;

import java.util.Scanner;

public class jung_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 100까지의 수 중 소수를 표기합니다.");
        isprime();


    }

    public static void isprime() {

        for (int i = 1; i <= 100; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.println(i);
            } else if
            (8 <= i && i <= 100) {


                boolean a = i % 2 == 0;
                boolean b = i % 3 == 0;
                boolean c = i % 5 == 0;
                boolean d = i % 7 == 0;
                if (a == false && b == false && c == false && d == false) {
                    System.out.println(i);
                }

            }

        }
    }
}
