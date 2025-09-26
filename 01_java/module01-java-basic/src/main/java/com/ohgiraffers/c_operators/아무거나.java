package com.ohgiraffers.c_operators;

import java.util.Scanner;

public class 아무거나 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0)
            System.out.println(a + "는 짝수이다");
        else
            System.out.println(a + "는 홀수이다");
        sc.close();

    }

}
