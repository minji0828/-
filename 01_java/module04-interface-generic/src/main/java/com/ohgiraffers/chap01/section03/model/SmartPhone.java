package com.ohgiraffers.chap01.section03.model;

public class SmartPhone extends portavledevice implements rechargeable{
    public SmartPhone(String model) {
        super(model);
    }

    @Override
    public void recharge() {
        System.out.println(super.getmodel()+" 충전 중");

    }
}
