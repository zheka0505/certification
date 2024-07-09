package org.example;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int letters = 62;
        int space = 12;
        int ins = letters * 5 + space * 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну забора:");
        int number = sc.nextInt();


        if (number >= ins) {
            System.out.println("Надпись поместиться");
        } else {
            System.out.println("Надпись не поместиться");
        }


    }
}
