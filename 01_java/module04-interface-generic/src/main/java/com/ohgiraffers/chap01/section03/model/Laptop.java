package com.ohgiraffers.chap01.section03.model;

public class Laptop extends portavledevice implements rechargeable{

    public Laptop(String model) {
        super(model);
    }

    @Override
    public void recharge() {
        System.out.println(super.getmodel() + "디바이스 충전 중");
    }
}
