package com.ohgiraffers.chap01.section02;
/*
* 인터페이스로 울음소리 관점 분리
*
* 인터페이스란?
* -특정 관점(기능)을 독립적으로 정의한 규칙이다.
* - interface로 선언, 구현은 클래스에서
* - 비유 울어라 규칙을 따로 만들어 필요한 동물만 가지고 갈 수 있도록 한다.
*
* 인터페이스로 상속 문제 해결
* - animal은 기본 동물 정의, 울음소리는 soundmaker로 분리
* - 강아지 고양이는 soundmaker 구현 ,뱀은 안함
* - 결과 울음소리 없는 뱀은 불필요한 기능을 물려받지 않음
* */
public class application {

    public static void main(String[] args) {

        animal[] animals = {new dog(), new cat(), new snake()};

        for (animal animal : animals) {
            if(animal instanceof soundmaker) {
                ((soundmaker)animal).makesound();
            }else {
                System.out.println(animal.getClass().getSimpleName() + "는 울음소리를 낼 수 없어요");
            }


          }
        }

}
//