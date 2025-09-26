package com.ohgiraffers.c_operators;

import javax.swing.*;

public class application {
    public static void main(String[] args) {
        /*
        * 연산자(operators)
        *
        * 산술 연산자
        * 수학적 계산을 수행하는 연산자이다
        * + - * / %
        *
        * 비교 연산자
        * 두 값을 비교하여 참 거짓을 반환하는 연산자이다
        * == (같음) != (다름) < (작음) > (큼) <=(작거나같음) >= (크거나같음)
        *
        * 논리 연산자
        * 하나 이상의 "조건을 결합"하여 최종적인 참 또는 거짓을 평가하는 연산자이다.
        * 예시 && (논리 : AND) ㅣㅣ (논리 OR) !(논리 NOT)
        *
        * 대입 연산자
        * 변수에 값을 할당하는 연산자이다.
        * = (대입) += (덧셈후 대입) -= (뺄셈 후 대입) *= (곱셈 후 대입) /= (나눗셈 후 대입)
        *
        * 증감 연산자
        * 변수의 값을 1씩 증가시키거나 감소시키는 연산자이다.
        * ++ (증가)
        * -- (감소)
         */

        int a = 10;
        int b = 3;

        System.out.println("덧셈 : " + (a + b));
        System.out.println("나눗셈 " + (a / b));
        System.out.println("나머지 : " + (a % b));

        boolean isgreater = a > b;
        System.out.println("a가 b보다 큰가? " + isgreater);


        /*
        *논리 연산자

         */

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("둘 다 참인가? : " + (isTrue && isFalse));
        System.out.println("둘중 하나는 거짓인가? : " + (isTrue || isFalse));
        System.out.println("NOT은 너가 거짓이라는 것을 부정하겠어." + !isFalse);

        //증감 연산자
        int q = 1;
        System.out.println(++q);
        System.out.println(--q);

    }
}
