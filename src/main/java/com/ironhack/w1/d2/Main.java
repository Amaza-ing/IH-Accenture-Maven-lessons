package com.ironhack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ARRAYS

        String[] days = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        System.out.println(days[0]);

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[2]);
        System.out.println(subjectsArray.length);


//        FOR LOOP

        for (int i = 0; i < subjectsArray.length; i++) {
//            if (subjectsArray[i].equals("Lengua")) continue;
            System.out.println(subjectsArray[i]);
//            if (subjectsArray[i].equals("Historia")) break;
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[j] = i;
                j++;
            }
        }

        System.out.println(evenNumbers);
        System.out.println(Arrays.toString(evenNumbers));


//        FOREACH LOOP

        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();


//        WHILE LOOP

        int counter = 0;
        while (counter < evenNumbers.length) {
            counter++;
        }
        System.out.println("counter: " + counter);


//      DO WHILE LOOP

        counter = 0;
        do {
            counter++;
        } while (counter < evenNumbers.length);
        System.out.println("counter: " + counter);


//        MATH CLASS & CASTING

        System.out.println(Math.sqrt(64));
        System.out.println((int) Math.pow(2, 5));
        System.out.println((int) 3.42);


//        ARRAYLIST

        List<String> countries = new ArrayList<>();
        countries.add("España");
        countries.add("Portugal");
        countries.add("Francia");
        System.out.println(countries);
        System.out.println(countries.get(0));
        countries.set(0, "Italia");
        System.out.println(countries.get(0));
        System.out.println(countries.size());
        countries.remove(0);
        System.out.println(countries.size());

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        List<Integer> intList = new ArrayList<>();


//        ADD ELEMENTS TO ARRAY

        int[] numbers = {0, 1, 2, 3, 4};
//        numbers[5] = 5; // Esto no se puede con un Array

        int[] newArray = new int[6];
        for (int i = 0; i < 5; i++) {
            newArray[i] = numbers[i];
        }
        newArray[5] = 5;
        System.out.println(Arrays.toString(newArray));
    }

    public static String[] createSubjectsArray() {
        String[] subjects = new String[5];
        subjects[0] = "Matemáticas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Biología";
        subjects[4] = "Química";

        return subjects;
    }
}
