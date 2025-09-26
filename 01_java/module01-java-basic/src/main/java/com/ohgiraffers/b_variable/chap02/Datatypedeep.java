package com.ohgiraffers.b_variable.chap02;

public class Datatypedeep {

    public static void main(String[] args) {
        /*
        *[데이터 타입의 딥한 개념 : 부동소수점과 정밀도]
        * 자바의실수형("float", "double")은 IEEE 754 부동소수점 표준을 따른다
        *
        * -부동소수점(Floating-point) : 실수를 부호 , 지수 , 가수로 표현
        *   -"float" : 32비트(부호 1비트, 지수 8비트, 가수 23비트)
        *   -"double" : 64비트(부호 1비트, 지수 11비트, 가수 52비트)
        * - 구조
        *   - 부호 비트 (sign bit) 숫자가 양수인지 음수인지 표현
        *   - 지수 : 숫자의 크기를 결정하면 2의 거듭제곱으로 표현
        *   - 가수 : 숫자의 유효숫자(소수점 이하 표현)를 나타낸다
        *
        *
        * - 이진 표현의 한계
        *   - 10진수 소수는 이진수로 전홛히 표현되지않음
        * 이로 인해 근사값으로 저장되며 , float 보다 double이 더 높은 정밀도를 제공
        * - 부동소수점 오차 :
        *   - 연산 시 미세한 오차가 누적될 수 있음
        *   - 예 : 0.1 + 0.2는 정확하게 0.3이 되지 않고, 약 0.0300000000000004로 계산
        * - 실무적 합의 :
        *  - 실수 비교 시 "==" 대신 오차범위(예 math.abs(a-b) < 0.0001)를 사용권장
        *  - 정밀도가 중요한 경우 bigdecimal 클래스를 사용
        *
         * */

        float fVal = 0.1f;
        double dVal = 0.1;
        System.out.println("fVal" + fVal);
        System.out.println("dVal" + dVal);
        System.out.println("fVal == dVal : " + (fVal > dVal));

        // 부동 소수점 오차
        double dNum = 0.1;
        double dNum2 = 0.2;
        double dNum3 = 0.3;
        System.out.println(dNum + dNum2 > dNum3);
    }
}
