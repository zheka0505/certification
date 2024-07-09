package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.example.Sensor.getHumidity;

public class SensorDataProcessing {

    public static void dataProcessing(LocalDate lastWatering) {

        int month = lastWatering.getMonthValue();
        int humidity = getHumidity();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Полейте кактус: " + formatter.format(lastWatering.plusMonths(1)));
        }

        if (month >= 9 && month <= 11 || month >= 3 && month <= 5) {
            System.out.println("Полейте кактус: " + formatter.format(lastWatering.plusWeeks(1)));
        }

        if (month >= 6 && month <= 8) {
            if (humidity < 30) {
                System.out.println("Полейте кактус: " + formatter.format(LocalDate.now()));
            } else {
                System.out.println("Полейте кактус: " + formatter.format(lastWatering.plusDays(2)));
            }
        }
    }
}
