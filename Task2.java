package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static org.example.SensorDataProcessing.dataProcessing;

public class Task2 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Введите дату последнего полива, в формате dd.MM.yyyy:");
        String input = new Scanner(System.in).nextLine();
        LocalDate date = LocalDate.parse(input, formatter);

        dataProcessing(date);

    }
}
