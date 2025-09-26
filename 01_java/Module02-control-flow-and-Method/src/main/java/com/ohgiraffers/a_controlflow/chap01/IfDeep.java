package com.ohgiraffers.a_controlflow.chap01;


        /*
        * if문으 깊은 개념 :
        * if 문은 jvm 스택에서 조건식을 계산하고, 그 결과(boolean)이 스택에 저장된다.
        * - 조건식이 true이면 해당 코드 블록으로 (jump), false면 다음 분기로 이동
        * - 복잡한 조건식(예 a>b && c<b)은 단락 평가(short-circuit evaluation)를 통해 최적화 된다.
        *
        * short-circuit evaluation(단축 평가)
        * and 연산(&&)
        * - 두 피연산자가 모두 참일떄만 전체 표현식이 참
        * - 첫번째 피연산자가 거짓일 경우 두번째 피연산자를 평가할 필요가 없으므로 평가를 중단
        *
        * OR(||) 연산 : 둘 중 하나
        * - 두 피연산자 중 하나라도 참일 경으 전체 표현식이 참
        * - 첫 번째 피연산자가 참일 경우 두번쨰 피연산자를 평가할 필요가 없으므로 평가를 중단
        *
        *
        * 메모리 관점
        * - 조건식의 변수는 스택에 저장되며 블록 내 지역 변수도 스택 프레임에 추가
        * - 너무 많은 중첩 if는 스택 상요량을 늘리고 가독성을 떨어뜨린다.
        *
        * jdk 17개선 패턴 매칭으로 if 문대신 instanceof 와 함께 사용가능
        *
        * */
        public class IfDeep {
            public static void main(String[] args) {

                int age = 25;
                String discount;

                System.out.println("비효율적인 조건 순서 : ");
                long starttime =System.nanoTime();
                if(age<= 19){
                    discount = "학생 할인 가능";
                }else{
                    discount = "학생 할인 불가능";
                }
                long endtime =System.nanoTime();
                System.out.println("결과 : " + discount + " 시간 : " +(endtime - starttime));




                System.out.println("최적화 조건 순서 : ");
                starttime = System.nanoTime();
                if(age>19){
                    discount = "학생 할인 불가능";
                }else{
                    discount = "학생 할인 가능";
                }
                endtime =System.nanoTime();
                System.out.println("결과 : " + discount + " 시간 : " + (endtime - starttime));
    }
}
