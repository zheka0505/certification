package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Task3 {

    public static void main(String[] args) {

        Integer[] array = {1, 5, 7, 3, 2, 0, 4, 9, 6, 15, 12};
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(array[1]);

    }
}
