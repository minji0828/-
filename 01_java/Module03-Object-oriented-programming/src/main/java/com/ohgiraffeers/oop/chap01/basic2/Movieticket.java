package com.ohgiraffeers.oop.chap01.basic2;

public class Movieticket {

    String moviename;
    String seatnumber;

    public Movieticket(String moviename, String seatnumber) {
        this.moviename = moviename;
        this.seatnumber = seatnumber;
    }
    public void printticket(){
        System.out.println("영화 제목 : " + moviename);
        System.out.println("좌석 번호 : " + seatnumber);


    }
}
