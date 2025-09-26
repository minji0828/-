package com.ohgiraffers.fileio.section02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ㅇㅇㅁㅇㅁㅇ.txt")))
    }
}
