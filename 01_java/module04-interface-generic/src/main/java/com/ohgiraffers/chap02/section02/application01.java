package com.ohgiraffers.chap02.section02;
/*
* 제네릭스란
* - 클래스나 메서드에 사용할 타입을 나중에 지정할 수 있도록 해주는 기능이다
* - 타입 파라미터(t)를 사용해서 객체를 만들때 타입을 정한다.
* - 비유 : 상자(box)를 만들 때 안에 넣을 물건(타입)을 나중에 정하는 것이다.
*
* 제네릭스가 필요한 이유
* - 제네릭스 없이 상자를 만들면 모든 물건(object)을 넣을 수 잇지만
* - 꺼낼때 형변환이 필요하다 . > 실수하면 런타임 오류
* - 예 : object box에 string을 넣고 꺼낼때 integer로 형변환하면 오류
* - 제네릭스는 타입을 미리 정해서 이런 실수를 컴파일 시점에 잡아준다.
*
* 장점:
* - 초급 : 잘못된 물건 못넣게해서 실수를 줄임
* - 중급 : 형변환하지않고 사용할 수 있어서 좋음
* - 고급 : 타입 안정성 확보로 런타임 오류 방지
*
* */
public class application01 {
    public static void main(String[] args) {
        System.out.println("=== 제네릭 상자 ===");
        genericbox<String> stringbox = new genericbox<>();
        stringbox.setItem("hello");
        String result = stringbox.getItem();
        System.out.println(result);

        genericbox<Integer> integerbox = new genericbox<>();
        integerbox.setItem(1345);
        Integer result2 = integerbox.getItem();
        System.out.println(result2);

    }
}
