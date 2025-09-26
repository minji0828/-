package com.ohgiraffers.a_controlflow.chap01;


import java.util.Scanner;

/*if 문
* if 문은 조건식의 결과에 따라 프로그램으 실행 흐름을 분기시키는 제어문이다
* 조건식이 true일 경우 실행 블록이 수행되며, false일 경우 건너뛴다.
* 형식 : if(조건식){실행 코드}
*       else if(조건식){실행코드}
*       else{대체코드}
* 조건식은 boolean 타입으로 평가되며 단일 조건 또는 복합 조건(논리 연산자 사용가능)을 포함할 수 있다.
*
* 실생활 예시 : 만약 비가 오면 우산을 들고가고, 그렇지 않으면 그냥 간다.
*  */
public class Application01 {
    public static void main(String[] args) {
       //  int score = 75;
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90){
            System.out.println("A 등급");
        }else if(score >= 80){
            System.out.println("B 등급");
        }else if(score >= 70){
            System.out.println("C 등급");
        }else{
            System.out.println("D등급 이하");
        }
    }
}
