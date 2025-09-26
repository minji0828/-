package com.ohgiraffeers.oop.chap05.section02;

public class cat extends animal{


    @Override
    public void makesound(){
        System.out.println("야옹");

    }




    public void catchmouse(){
        System.out.println("쥐를 잡자!");




    }
    @Override
    public String toString() {
        return "고양이";
    }
}
