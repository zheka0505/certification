package org.example;

import java.util.Scanner;

import static org.example.GameProcessing.processing;


public class Task4 {

    public static void main(String[] args) {

        int userPoints = 0;
        int machinePoints = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Выбирете: " + "К-камень " + "Н-ножницы " + "Б-бумага");
            String input = new Scanner(System.in).nextLine();

            int[] array = processing(input);
            userPoints = userPoints + array[0];
            machinePoints = machinePoints + array[1];
        }

        System.out.println("Ваши баллы: " + userPoints);
        System.out.println("Баллы соперника: " + machinePoints);

        if (userPoints > machinePoints) {
            System.out.println("Вы победили!");
        }
        if (userPoints < machinePoints) {
            System.out.println("Вы проиграли");
        }
        if (userPoints == machinePoints) {
            System.out.println("У вас ничья");
        }
    }
}
