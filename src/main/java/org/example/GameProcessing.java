package org.example;

import static org.example.GameRandom.getAnswer;

public class GameProcessing {

    public static int[] processing(String userData) {


        String random = getAnswer();
        System.out.println("Программа: " + random);

        if (userData.equals(random)) {
            System.out.println("Ничья");
        }

        if (userData.equals("К") && random.equals("Н")) {
            return new int[]{1, 0};
        }

        if (userData.equals("Н") && random.equals("К")) {
            return new int[]{0, 1};
        }

        if (userData.equals("Н") && random.equals("Б")) {
            return new int[]{2, 0};
        }
        if (userData.equals("Б") && random.equals("Н")) {
            return new int[]{0, 2};
        }

        if (userData.equals("Б") && random.equals("К")) {
            return new int[]{5, 0};
        }

        if (userData.equals("К") && random.equals("Б")) {
            return new int[]{0, 5};
        }

        return new int[]{0, 0};
    }
}
