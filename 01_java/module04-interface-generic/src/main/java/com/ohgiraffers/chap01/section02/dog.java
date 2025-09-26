package com.ohgiraffers.chap01.section02;

public class dog extends animal implements soundmaker{

    @Override
    public void makesound() {
        System.out.println("멍멍" + soundmaker.DECIBEl + "크기");
    }
}
