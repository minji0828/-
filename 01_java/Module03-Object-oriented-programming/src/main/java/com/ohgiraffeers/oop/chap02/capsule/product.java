package com.ohgiraffeers.oop.chap02.capsule;


/*
* 캡슐화를 적용한 코드
*
* 1. 필드를 private로 선언하여 외부 접근 차단.
* 2. getter와 setter 매서드를 통해 안전하게 데이터 조작
* 3. setter에서 데이터 무결성 검증 추가.
*
* */
public class product {
    private double payments;

    public product() {}


    public product(double payments) {
        if(payments == 0){
            System.out.println("손님 0원짜리 제품이 어디있어요.");
        } else if(payments < 0){
            System.out.println("손님 팔고 돈도 주면 누가 장사해요.");
        }else{
            System.out.println("손님 남는 것은 없는데 그렇게 할까요?");
            this.payments = payments;
        }
    }
        this.payments = payments;
    }


    public void setPayments(double payments) {
        if(payments == 0){
            System.out.println("손님 0원짜리 제품이 어디있어요.");
        } else if(payments < 0){
            System.out.println("손님 팔고 돈도 주면 누가 장사해요.");
        }else{
            System.out.println("손님 남는 것은 없는데 그렇게 할까요?");
            this.payments = payments;
        }
    }



    public String selling() {
        return payments + "원 입니다.";
    }
}
