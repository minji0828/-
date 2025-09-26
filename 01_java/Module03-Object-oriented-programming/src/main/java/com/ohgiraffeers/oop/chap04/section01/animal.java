package com.ohgiraffeers.oop.chap04.section01;
/*
* 추상화
* - 복잡한 세부사항 숨기고 핵심기능만 정의하는 방법
*  쉽게 설명하면 인터페이스만 정의하고 나를 상속받는 너희들ㅇ ㅣ구현해라는말
* 이를 사용하면 세부내용 은달라도 동일한 이름으로 실행가능
* 비유 - 동물에게 짖어 라고하면 어떻게 낼지는 몰라도 소리가 나옴
* */
public abstract class animal {

        public String name;

        public animal(String name) {
            this.name = name;
        }

            /*abstract 키워드
             * -클래스나 메서드를 추상적으로만듬
             * -abstract 클래스 : 객체를 직접 생성할 수 없으며 자식 클래스에서 상속해야함
             * 이를 상속받는 클래스에서는 반드시 불완전한 요소를 해결해야한다
             * 이러한 거을 구현 책임의 원칙 이라고 한다
             * abstract 매서드 몸체가 없으며 자식 클래스에서 반드시 구현해야한다.
             *
             *
             * */
            public abstract void makesound (); // 추상 메서드


        }
