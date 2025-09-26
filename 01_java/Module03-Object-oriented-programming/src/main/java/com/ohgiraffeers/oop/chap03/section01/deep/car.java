package com.ohgiraffeers.oop.chap03.section01.deep;

public class car {

    private engine engine;

    public car(engine engine){
        this.engine = engine;
    }



    public void drive(){
        this.engine.start();
        this.engine.increasespeed();
        System.out.println("차가 달립니다.");
    }
}
