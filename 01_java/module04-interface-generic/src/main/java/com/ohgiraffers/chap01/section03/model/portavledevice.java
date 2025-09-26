package com.ohgiraffers.chap01.section03.model;

public class portavledevice extends device {
    public portavledevice(String model) {
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println("power on 휴대용 기기" + super.getmodel());
    }

    @Override
    public void powerOff() {
        System.out.println("power off 휴대용 기기" + super.getmodel());
    }
}
