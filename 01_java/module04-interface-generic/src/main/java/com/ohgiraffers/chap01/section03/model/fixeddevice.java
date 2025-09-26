package com.ohgiraffers.chap01.section03.model;

public class fixeddevice extends device{

    public fixeddevice(String model) {
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println("power on 고정형" + super.getmodel());
    }

    @Override
    public void powerOff() {
        System.out.println("power off 고정형" +  super.getmodel());
    }
}
