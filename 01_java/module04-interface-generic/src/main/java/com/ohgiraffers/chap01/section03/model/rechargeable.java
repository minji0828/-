package com.ohgiraffers.chap01.section03.model;

public interface rechargeable {
    void recharge();

    default void checkbattery(){
        System.out.println("기본 배터리 상태 점검");
    }

}
