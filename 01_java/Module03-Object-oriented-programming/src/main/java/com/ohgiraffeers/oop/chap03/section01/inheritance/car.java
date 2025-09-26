package com.ohgiraffeers.oop.chap03.section01.inheritance;

public class car {

    public String brand;
    public int speed;
    public String model;

    public void accelerate(){
        speed += 10;
        System.out.println("brand : " + brand + " speed : " + speed);

    }
}
