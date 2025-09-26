package com.ohgiraffers.chap01.section03.model;

import javax.swing.text.LabelView;

public abstract class device {
    private String name;
    private String model;

    public device(String model) {
        this.model = model;
    }

    public abstract void powerOn();
    public abstract void powerOff();


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;


    }


    public String getmodel() {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "device{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

