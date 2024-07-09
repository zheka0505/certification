package org.example;

import java.util.Random;

public class GameRandom {

    public static String getAnswer() {
        Random r = new Random();
        int number = r.nextInt(3);
        String[] array = {"К", "Н", "Б"};
        return array[number];
    }
}
