package com.ohgiraffeers.oop.chap01.basic2;



/*
* 생성자(constructor)린?
* - 객체를 만들 때(new로 호출 시) 처음 실행되는 특수한 메서드이다.
* - 클래스 이름이 같고 반환 타입이 없다.
* - 역할 : 객체의 초기 상태를 설정(필드 값 초기화)
* - 비유 : 자동차 공장에서 차를 만들때 처음 브랜드와 모델을 붙이는 과정!
*
*  실생활 예제
*  영화 티켓을 예매할 때, "영화 제목" , "좌석 번호"를 초기화해야 한다
* */
public class application {
    public static void main(String[] args) {

        ticketWithoutConstructor ticket = new ticketWithoutConstructor();
        ticket.printticket();
        ticket.moviename = "어벤져스";
        ticket.seatnumber = "B10";
        ticket.printticket();

        System.out.println();

        Movieticket movieticket = new Movieticket("어벤져스", "a10");
        movieticket.printticket();
        /*
        *
        *  */


    }

}
