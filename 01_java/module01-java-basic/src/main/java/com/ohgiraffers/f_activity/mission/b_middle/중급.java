package com.ohgiraffers.f_activity.mission.b_middle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 중급 {
    public static void main(String[] args) {


        String score = "국어:80,영어:75,수학:90,과학:65";


        String[] str = (score.split(","));
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);


        String[] korean = (str[0].split(":"));
        int sc = Integer.parseInt(korean[1]);
        if (sc >= 90) {
            System.out.println(korean[0] + " 등급은 A ");
        } else if (sc >= 80) {
            System.out.println(korean[0] + " 등급은 B ");
        } else if (sc >= 70) {
            System.out.println(korean[0] + " 등급은 C ");
        } else {
            System.out.println(korean[0] + "등급은 D");
        }

        String[] english = (str[1].split(":"));
        int sc1 = Integer.parseInt(english[1]);
        if (sc1 >= 90) {
            System.out.println(english[0] + " 등급은 A ");
        } else if (sc1 >= 80) {
            System.out.println(english[0] + " 등급은 B ");
        } else if (sc1 >= 70) {
            System.out.println(english[0] + " 등급은 C ");
        } else {
            System.out.println(english[0] + "등급은 D");
        }

        String[] math = (str[2].split(":"));
        int sc2 = Integer.parseInt(math[1]);
        if (sc2 >= 90) {
            System.out.println(math[0] + " 등급은 A ");
        } else if (sc2 >= 80) {
            System.out.println(math[0] + " 등급은 B ");
        } else if (sc2 >= 70) {
            System.out.println(math[0] + " 등급은 C ");
        } else {
            System.out.println(math[0] + "등급은 D");
        }

        String[] sci = (str[3].split(":"));
        int sc3 = Integer.parseInt(sci[1]);
        if (sc3 >= 90) {
            System.out.println(sci[0] + " 등급은 A ");
        } else if (sc2 >= 80) {
            System.out.println(sci[0] + " 등급은 B ");
        } else if (sc2 >= 70) {
            System.out.println(sci[0] + " 등급은 C ");
        } else {
            System.out.println(sci[0] + "등급은 D");
        }

        int sum = sc + sc1 + sc2 + sc3;
        double ava = (double) sum / str.length;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + ava);
    }
}
