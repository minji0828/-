package com.ohgiraffers.exception.section03;

public class application {
    public static void main(String[] args) {



        try{
            checkage(3);
        }catch (InvaildAgeException e){
            System.out.println(e.getMessage());
        e.printStackTrace();}
    }



    public static void checkage(int age)throws  InvaildAgeException{
        if(age<20){
            throw new InvaildAgeException("ㅇㅁㅇㅁㄴㅇㅁㄴㅇㅇㅁ");
        }
        System.out.println("dasdad");
    }
}
