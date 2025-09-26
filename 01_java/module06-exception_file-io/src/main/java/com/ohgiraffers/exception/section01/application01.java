package com.ohgiraffers.exception.section01;

/*
* 예외 처리 미사용
* - 예외 처릴를 하지 않으면 프로그램 실행중 발생한 예외로 인해 프로그램이 비정상적으로 종료될 수 있다.
* - 예를 들어 사용자가 0으로 나누기를 시도하면 프로그램이 즉시 종료되며 사용자에게 아무런 안내도 제공되지 않는다.
*
* 예외 처리가 필요한 이유
* - 예외가 발생하면 프로그램이 비정상적으로 종료된다.
* - 안정적인프로그램실행을 위해 반드시 처리해야한다
*
* */

public class application01 {

    public static void main(String[] args) {
        int number = 1;
        int result = number/1;
        System.out.println(result);
    }
}
