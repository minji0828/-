package com.ohgiraffers.collection.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* arrayList 기초
* - arrayList는 순서가 있는 동적 리스트로 데이터를 순차적으로 저장하며 중복을 허용한다
* - 배열과 달리 크기가 고정되지 않아 필요에 따라 확장된다
* - 배열은 크기 고정으로 유연성이 떨어지지만 ArrayList는 동적 관리가 가능하다.
*
* ArrayList의 주요특징
* 1. 동적 크기 조정
*  - ArrayList는 내부적으로 뱅여릉 사용하지만 크기가 고정되지않아서데이터를 추가될 때 자동으로 크기를 조정하낟.
*  - 크기가 부족할 경우 새로운 배열을 생성하여 기존 데이터를 복사하고 새로운 데이터를 추가하는 방식으로 작업한다.
*
*
* 2. 중복허용
* - ArrayList는 같은 값을 여러번 저장할 수 잇다. 이는 데이터 중복이 필요한 경우 유용하다.
*
* 3. 순서 유지
* - 요소의 순서가 유지되므로 인덱스를 통해 특정 요소에 접근할 수있다.
*
* 4. 데이터 타입
* - ArrayList는 제네릭을 사용하여 다양한 데이터 타입을 저장할 수 있다.
*
* 5. 성능
* - 요소 추가 시 리스트의 끝에 추가되는 경우 O(1)의 시간 복잡도를 가진다.
*  그러나 중간에 요소를 삽입하거나 삭제하는 경우 O(n)의 시간 복잡도를 가지므로 주의가필요하다.
*  0:a 1:b 2:c 3:d의 경우 1번 인덱스를 제거하면 0:a 1:c 2:d가 되어야한다.
* 즉 요소만큼 인덱스가 변경되어야해서 시간복잡도가 요소갯수만큼 늘어남.
*
* 6. 메모리 사용
* 어레이 리스트는 내부 배열을 사용하기 때문에 데이터수가많아지면 메모리 사용량이 증가할 수 있다.
*
* */
public class Application {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<>();

        bookList.add("자바의 정석");
        bookList.add("클린 코드");
        bookList.add("자바의 정석");

        System.out.println("ArrayList : " + bookList);
        String firstBook = bookList.get(0);
        System.out.println("First Book : " + firstBook);

        //요소 삭제
        bookList.remove(0);
        System.out.println("ArrayList : " + bookList);
        //요소 수정
        bookList.set(0,"Effective Java");
        System.out.println("수정된 list : " + bookList);

        System.out.println("ArrayList : " + bookList.size());

        String[] arraybooks = new String[2];
        arraybooks[0] = "Effective Java";
        arraybooks[1] = "클린 코드";
//        arraybooks[2] = "추가 불가"; error

        System.out.println("Array" + Arrays.toString(arraybooks));

        bookList.add("A");
        System.out.println("ArrayList : " + bookList);
        Collections.sort(bookList);
        System.out.println("ArrayList : " + bookList);

    }
}
