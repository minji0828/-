package com.ohgiraffers.b_loop.chap01;

/*
* for문 동작의 메모리 구조
* 1) for문이 시작될 때 반복제어 변수 ()은 스택에 생성된다
* 2)조건문이 참이면 본문을 실행하고 증감식을 통해 변수 값을 변경한 뒤
* 다시 조건을 검사하는 과정을 반복한다.
* 3) 반복 횟수가 끝나면 for 문의 스택 프레임은 제거되고 다음 코드로 넘어간다.
*
* [성능 최적화 관점]
* 1) for 문은 초기식에서 변수를 한번만 선언/계산하는 것이 좋다
*    예 :
* len = arr.length;
* len = [n]
*
* for (int i = 0, i < len; i++){...}
* (이렇게 하면 조건식에서 arr.length를 매번 호출하지 않아도 되어 미세한 성능향상)
* 2) JIT(just in time) 컴파일러가 반복패턴을 저장한다*/
public class fordeep {
    public static void main(String[] args) {

        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

        }

        long starttime = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        long endtime = System.nanoTime();

        System.out.println("일반 for 문 결과 합계 " + sum1 + "실행 시간 :" + (endtime - starttime));

        starttime = System.nanoTime();
        int sum2 = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            sum2 += arr[i];
        }
        long end1time = System.nanoTime();
        System.out.println("캐시된 for 문 결과 합계 " + sum2 + "실행 시간 :" + (end1time - starttime));




        /*
         * for each
         * for each를 상요하면 요소를 순회하는 과정에서 내부적으로 최적화된 방법을 사용한다.
         * 또한 조건식 기술 등의 코드가 감소하면서 성능이 높아지게 된다.
         * 그러나 큰 차이는 없다.
         * *//*
        startTtime = System.nanoTime();
        int sum3 = 0;
        for (int a : arr) {
            sum3 + a;
        }
         endTtime = System.nanoTime();
        System.out.println();
    }
*/
    }
}