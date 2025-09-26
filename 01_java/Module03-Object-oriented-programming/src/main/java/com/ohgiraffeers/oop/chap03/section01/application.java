package com.ohgiraffeers.oop.chap03.section01;

import com.ohgiraffeers.oop.chap03.section01.noninheritance.ElectricCar;
import com.ohgiraffeers.oop.chap03.section01.noninheritance.car;

/*
 * 상속
 * - 상속은 객체지향 프로그램의 핵심 개념 중 하나로, 기존 클래스(부모 클래스 또는 슈퍼 클래스)의 속성(필드)와 기능(메서드)를
 *  새로운 클래스가 물려받는 것을 의미한다,
 * - 자식 클래스는 부모 클래스의 모든 공개(public) 및 보호(protected)필드와 메서드에 접근할 수 있다.
 * - 상속을 통해 코드의 재사용성을 높이고, 공통된 기능을 갖진 여러 클래스를 쉽게 관리할 수 있다.
 * -"electriccar"클래스는 "car" 클래스를 상속받아."car"클래스의 속성과 새로운 매서드를 추가한다.
 * "batterylevel"이라는 새로운 속성과 "cargebattery()"라는 새로운 매서드를 추가한다.
 * - 자식 클래스는 부모 클래스의 메서드를 오버라이드(override)할 수 있어, 기능을 변화시킬 수 있다.
 *
 * */
public class application {
    public static void main(String[] args) {

        car car = new car();
        car.brand = "honda";
        car.speed = 10000;
        car.accelerate();

        ElectricCar electricCar = new ElectricCar();
        electricCar.brand = "tesla";
        electricCar.speed = 10000;
        electricCar.accelerate();

        /*
         *
         * 문제점
         * 1. 동일한 코드가 여러클래스에서 중복
         * 2. 변경사항 생기면 모든 클래스에서 일일이 수정
         * 3. 유지보수성 낮아짐
         * */

        com.ohgiraffeers.oop.chap03.section01.inheritance.car car1 = new com.ohgiraffeers.oop.chap03.section01.inheritance.car();
        car1.brand = "honda";
        car1.speed = 10000;
        car1.model = "honda car";
        car1.accelerate();

        com.ohgiraffeers.oop.chap03.section01.inheritance.ElectricCar electricCar1 = new com.ohgiraffeers.oop.chap03.section01.inheritance.ElectricCar();
        electricCar1.brand = "tesla";
        electricCar1.speed = 10000;
        electricCar1.batterylevel = 0;
        electricCar1.model = "model s";


        electricCar1.accelerate();
        electricCar1.chargebattery();

        /*
        * 상속을 적용.
        * 1. car 클래스는 부모 클래스로 만들고 "ElectricCar"에서 상속을 받는다.
        * - 이를 통해 car가 가진 기능을 ElectricCar에서 사용할 수 있게 된다.
        * - 단 부모의 필드 혹은 메서드에 private로 추가된 속성은 자식이 사용할 수 없다
        * 2. 상속을 통해 중복된 속성과 기능은 재정의가 필요없어지게 되며 batterycharge만 추가하면된다.
        *
        * */


    }

}
