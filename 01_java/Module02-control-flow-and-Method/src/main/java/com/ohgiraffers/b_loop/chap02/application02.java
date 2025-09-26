package com.ohgiraffers.b_loop.chap02;

/*
*  while 문 응용
*  while 문을 사용해 사용자가 입력 기반 반복이나 조건 기반 종료를 구현할 수 있다.
* 예 : 0이 될 때까지ㅏ 숫자 감소
*
* while 문 제어 키워드 :
*  - break : 반복문을 즉시 종료하고 빠져나감
*  - continue : 현재 반복문을 건너뛰고 다음 반복으로 진행
*  - label break : 지정한 부분을 종료함 <- */
public class application02 {
    public static void main(String[] args) {

        int num = 5;

        System.out.println("용사의 모험 시작: 몬스터를 물리치고 보물을 찾아라");
        System.out.println("용사의 초기 체력 : " + num + "hp");
        while(num>0){
            if(num % 2 == 0){
                System.out.println("독의 느지에 빠졌다. 체력 : " + num + "hp는 짝수라 회복");
                num--;
                System.out.println("회복 중에는 전투 불가능");
            }

            if(num == 3){
                System.out.println("보물을 발견했다." + num + "hp");
                break;
            }

            System.out.println("몬스터와 전투 ! 체력 감소 " + num +"hp");
        }


        /*
         * [while 문 동작의 메모리 구조]
         * 1) while 문이 시작될 때, 조건식에 사용되는 변수(예: count, limit)는 스택에 생성된다.
         * 2) 조건식이 참이면 본문을 실행하고, 조건을 다시 검사하며 반복한다.
         * 3) 조건이 거짓이 되면 while 문의 스택 프레임이 제거되고 종료된다.
         *
         * [성능 최적화 관점]
         * 1) 조건식 계산을 최소화하면 성능이 향상된다.
         *    예: while (count <= limit) { ... }로 상수값 활용.
         * 2) 비최적화된 경우, 반복마다 calculateLimit()을 호출하여 성능 저하 발생.
         * 3) 무한 루프(while (true))는 스택 오버플로우를 유발할 수 있으니 break 사용 권장.
         * 4) JIT 컴파일러가 루프 언롤링(unrolling)으로 최적화 가능.
         */
       // public class WhileDeep {
         //   public static void main(String[] args) {
                // 1. 비최적화 while 문: 조건식에서 매번 계산
                System.out.println("1. 비최적화 while 문");
                long startTime = System.nanoTime();
                int count = 0;
                while (count <= calculateLimit()) { // 매 반복마다 calculateLimit() 호출
                    System.out.println("비최적화 카운트: " + count);
                    count++;
                }
                long endTime = System.nanoTime();
                System.out.println("실행 시간: " + (endTime - startTime) + "ns\n");
                // while 문은 매 반복마다 calculateLimit() 메서드를 호출하여 조건식을 평가




                // 2. 최적화 while 문: 상수값 활용
                System.out.println("2. 최적화 while 문");
                startTime = System.nanoTime();
                count = 0;
                int limit = calculateLimit(); // 한 번만 계산
                while (count <= limit) { // 단순 비교로 최적화
                    System.out.println("최적화 카운트: " + count);
                    count++;
                }
                endTime = System.nanoTime();
                System.out.println("실행 시간: " + (endTime - startTime) + "ns");
                // calculateLimit()을 매번 호출하지 않고 Stack 프레임에 저장하여 호출
            }

            private static int calculateLimit() {
                return "안녕하세요 ~~~".length(); // 문자열 길이 반환 (13)
            }
        }
//
    //}//
//}//
