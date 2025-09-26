package com.ohgiraffers.a_basic;
/*  java의 기본 구조 및 실행 방식

        java는 클래스를 기반으로 프로그램을 작성하는 객체 지향 프로그래밍 언어이다.
       모든 java 프로그램은 클래스 안에서 동작하며 main() 메서드가 프로그램의 시작점이 된다.

* java의 실행과정 :
1. java 소스코드 을 작성한다.
2. 컴파일러를 사용하여 바이트코드(.class)로 변환한다
3.jvm이 .class파일을 실행한다.
4.jvm은 바이트코드를 해석하여 os에서 실행가능한 기계어로 변환한다.
5.실행 결과를 출력하거나 다른 연산을 수행한다.

java 실행방식 이해하기

java의 실행 방식은 컴파일 + 인터프리터 방식을 사용한다
이는 java 코드가 먼저 바이트코드로 변환된 후jvm에 의해 해석 실행되는 것을 의미한다.

주요  개념 :
        - 컴파일(compile) : .java -> .class로 변환하기 위해(javac 사용) jvm이 고급 언어를 이해하기위함.
        - 바이트코드(bytecode) : jvm에서 실행 가느한 중간코드
        -jvm(java virtual machine) : 바이트코드를 os에 맞는 기계어로 변환하여 실행.
        -jit(ust-in-time)컴파일러 : 실행중 바이트코드를 네이티브 코드로 변환하여 성능향상.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}

