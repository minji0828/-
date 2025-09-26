package com.ohgiraffers.chap01.section03;

import com.ohgiraffers.chap01.section03.model.*;

import java.util.prefs.PreferenceChangeEvent;

/*
* 인터페이스 deep dive - 상속 계층도와 설계 간편화
*
* - 전자기기는 다양한 특성과 기능을 가지는데, 상속만으로 모든 기능을 정의함녀 불필요한 기능까지 물려받거나
*  유연성이 떨어질 수 있다.
* - 예 : 모든 기기에 충전을 상속한다면 tv도 충전해야하는 비현실적 상황 발생
* - 인터페이스로 특정 기능을 부닐하면 필요한 기기만 선택적으로 가져갈 수있어 설계가 깔끔해진다
*
* 설계 과정:
* 1. device로 기본 계측 구축
*  - 모든 전자기기는 전원을 켜고 끄는 기본 동작을 필요 -> device를 추상 클래스로 정의해 공통 동작 보장
*  - 역할 : 전자기기라는 큰 범주를 설정하고, 하위 계층으로 특성을 나눌 준비
*  - 비유 전자기기 공장에서 기본 설계도를 만드는 단계!
*
* 2) protabledevice와 fixeddevice로 특성 분리
* - 휴대기기는 이동가능 고정기기는 고정 설치 -> 계층도를 나누어 특성을 구체화
* - 역할 : 상속으로 각 기기의 기본동작을 다르게 정의해 계층적 관리가능
* - 비유 공장에서 휴대용과 고정형 라인으로 생산분리
*
* 3)recahrgeable 인터페이스로 충전 관점 분리
* - 모든 휴대기기가 충저가능한 것은 아님(예 : 배터리 없는 mp3)
* 스마트폰과 랩탑은 충전필요 ,tv는 불필요 -> rechargeable을 인터페이스로 분리 선택적적용
* 역할 : 상속 계층 밖에서 충전 기능을 정의해 필요한 기기만 가져가도록 유연성 확보
* 비유 : 공장에서 충전 옵션을 별도 부품으로 만들어 필요한 모델에만 장착
*
* 설계의 장점
* - 계층도 (devic - portable/fixed)전원동작 기기유형을 체계적으로 정리
* - 인터페이스(rechargeable) : 충전이라는 관점 독립적으로 정의 불필요한 결합방지
* - 결과 : 스마트폰과 랩탑은 충전가능 , 티비는 충전없이 고정기기로 유지 설계간결 확장쉬움
*
* 실부연계
* 상속계층으로 기본 구조를 잡고 인터페이스로 특정기능 모듈화하면 기기추가 기기확장 용이
*
* */
public class application {
    public static void main(String[] args) {
        System.out.println("=== 기기 특징과 충전 관점 ===");
        device smartPhone = new SmartPhone("galaxy");
        device laptop = new Laptop("mac");
        device tv = new TV("oled");
        // 상속에서 기본동작
        smartPhone.powerOn();
        laptop.powerOn();
        tv.powerOn();
        // 인터페이스 관점 충전
        ((rechargeable) smartPhone).recharge();
        ((rechargeable) laptop).recharge();

        device[] devices = {smartPhone,laptop,tv};
        for(device device : devices){
            device.powerOn();
            if(device instanceof rechargeable)
            {((rechargeable) device).recharge();

            }device.powerOff();
        }

    }


}
