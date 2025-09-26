package com.ohgiraffeers.oop.chap03.section02;

public class dog extends animal {

    public dog(String name) {
        super(name);

    }

    @Override
    public void makesound() {
        System.out.println(super.name + " 가 멍멍 울음소리를 냅니다.");
    }


}
