package com.ohgiraffeers.oop.chap05.section02;

public class dog extends animal{


    @Override
    public void makesound(){
        System.out.println("멍멍");

    }


    public void guard(){
        System.out.println("집을 지키자!");

        }
    @Override
    public String toString() {
        return "강아지";
    }

    }