package com.ohgiraffeers.oop.chap02.Deep;

public class capsuleDeep {
    private double payments;

    private  capsuleDeep(double payments)
    {
        this.payments=payments;
    }

    /*팩토리 패턴
    * 객체 생성 로직을 클라이언트 코드와 분리하여 객체 생성 과정을 캡슐화하는 디자인 패턴이다.
    * 클라이언트를 직접 객체를 생성하는 대신 팩토리 매서를 호출하여 객체를 얻는다.
    * 팩토리 매서드는 입력 값에 따라 객체 생성 여부를 결정할 수 있으며, 조건ㅇ ㅔ맞지 않는 경우 null을 반환할 수 있다.
    * 이를 통해 코드의 유연성과 재사용성을 높이고 객체 생성 방식을 쉽게 변경할 수있다.
    * */
    public static capsuleDeep createcapsule(double payments){
        if(payments <= 0){
            System.out.println("손님 제품 가져다 놓으세요");
            return null;
        }
        else{
            System.out.println("그렇게 할까요?");
            return new capsuleDeep(payments);
        }
    }


    public void setPayments(double payments){
        this.payments=payments;
    }
    public String selling() {
        return payments+ "원 입니다";
    }
}
