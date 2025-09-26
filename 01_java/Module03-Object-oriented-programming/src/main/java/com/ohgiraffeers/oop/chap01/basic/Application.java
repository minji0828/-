package com.ohgiraffeers.oop.chap01.basic;
/*
public class Application {
    public static void main(String[] args) {

        String brand = "tesla";
        String model1 = "model s";
        int speed1 = 0;

        String brand2 = "BMW";
        String model2 = "model s2";
        int speed2 = 0;

        System.out.println("Brand : " + brand + ", model: " + model1 + ", speed: " + speed1 );
        System.out.println("Brand2 : " + brand2 + ", model" + model2 + ", speed: " + speed2 );
*/
        /*
        * 문제점 :
        * 1. 데이터가 흩어져 있다. : brand1, model1. speed1은 논리적으로 하나의 묶음이지만, 코드상으로 뿔뿔이 흩어져있다.
        * 2. 관리의 어려움 : 자동차가 100대가 되면, 100개의 브랜드 100개의 모델 100개의 속도 변수를 모두 따로 관리해야한다.
        * 3. 실수 유발 : car1, brand와 car2 speed를 사용하는 실수를 해도 문법적으로 오류가 없다.
        *
        *
        * */

        /*
        * new 연산자란
        * - new는 클래스라는 설계도를 바탕으로 실제 객체(인스턴스)를 메모리(힙 영역)에 만드렁내는 명령어이다.
        * - new car()는 car 설계도를 보고 실제 자동차를 한대 생산해 라는 의미이다.
        *
        * mycar 변수(참조 변수)
        * - mycar는 방금 만들어진 car 객체가 메모리 어디에 있는지 주소(참조)를 저장한느 변수이다.
        * - 마치 자동차 열쇠처럼 이변수를 토해 실제 객체에 접근하고 조작할 수 있다.
        *
        *
        * */

        // 타입 변수명 = 값;
      //  car mycar; //변수 선언
      //  mycar = new car(); //초기화

        /*
        *
        * 인스턴스 참조
        * - mycar는 car 객체의 주소를 가지고 있으며 '.'(참조 연산자)는 이것을 참조한다라고 한다.
        * - mycar를 통해 객체의 속성(brand, model, speed)나 기능(acclerate, brake)을 사용할 수 있다.
        * */
/*
        mycar.brand = brand;
        mycar.model = model1;
        mycar.speed = speed1;
        mycar.acclerate();
        mycar.acclerate();
        mycar.brake();

        System.out.println();


    }
}
*/