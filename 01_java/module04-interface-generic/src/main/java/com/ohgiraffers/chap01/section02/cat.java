package com.ohgiraffers.chap01.section02;

public class cat extends animal implements soundmaker{

    @Override
    public void makesound() {
        System.out.println("야옹!" +soundmaker.DECIBEl+" 크기");
    }
}
