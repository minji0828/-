package com.ohgiraffeers.oop.chap03.section01.noninheritance;

public class car {
   public String brand;
    public int speed;

    public void accelerate(){
        speed += 50;
        System.out.println("brand : " + brand + ", speed : " + speed);

    }
}
