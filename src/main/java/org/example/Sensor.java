package org.example;

import java.util.Objects;
import java.util.Random;

public class Sensor {

    public static int getHumidity() {
        Random r = new Random();
        return r.nextInt(101);
    }


}
