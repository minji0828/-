package com;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String[] job = {"전사", "마법사", "궁수", "도적" };
        {
            switch (name) {
                case "전사" -> name = job[0];
                case "마법사" -> name = job[1];
                case "궁수" -> name = job[2];
                case "도적" -> name = job[3];
            }
        }
        character.attackpower = int attackpower;

        character[] party = {
                new warrior(job[0], 200,attackpower),
        new mage(job[1], 80,attackpower),
        new thief(job[2], 80, attackpower),
        new ach(job[3], 100, attackpower),};

        for (character a : party) {
            a.attack();
        }
    }
}