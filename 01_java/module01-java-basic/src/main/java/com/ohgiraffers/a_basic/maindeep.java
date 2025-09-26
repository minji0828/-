package com.ohgiraffers.a_basic;
/*
 * depp dive : jvm 메모리 구조
 * 1. method area(메서드 영역)
 *  -클래스 정보, static 변수, 상수 풀(constant pool) 저장
 *
 * 2. heap(힙)
 *  -객체 및 인스턴스 변수 저장
 * 3. stack(스택)
 *  - 지역 변수, 메서드 호출시 생성되는 프레임 저장
 * 4. pc register(pc 레지스터)
 *  - 현재 실행중인 jvm 명령어의 주소 저장
 * 5. native method stack(네이티브 메소드 스택)
 *  -JNI(java native interface)에서 사용하는 네이티브 코드 실행공간
 *  -os 통신 혹은 고성능 연산과 같은 작업을 위해 자바보다 적합한 언어로 개발된 코드가 저장되는 공간이다.
 * */