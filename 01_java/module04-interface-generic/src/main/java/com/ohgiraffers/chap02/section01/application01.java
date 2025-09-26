package com.ohgiraffers.chap02.section01;

public class application01 {
    public static void main(String[] args) {
        objectbox stringbox = new objectbox();
        stringbox.setItem("hello");

        String box = (String) stringbox.getItem();
        System.out.println(box);



    }
}
