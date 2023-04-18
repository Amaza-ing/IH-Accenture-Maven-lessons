package com.ironhack.w1.d1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//      DATA TYPES

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 99999999;
        double myDouble = 10.1234;
        boolean isBoolean = true;
        char myChar = 100;

        String myString = "Hola Ironhack!";
        String myName;
        myName = "Adrián";

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("isBoolean: " + isBoolean);
        System.out.println("myChar: " + myChar);
        System.out.println("myString: " + myString);

        myInt = 1234;
        System.out.println("myInt: " + myInt);
        myInt = myInt + 1000;
        System.out.println("myInt: " + myInt);
        myInt += 1000;
        System.out.println("myInt: " + myInt);

        myByte += 10;
        System.out.println("myByte: " + myByte);


//        OPERATORS

        int number = 10;
        myDouble = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(number % 3);
        System.out.println(myDouble / 3);
        System.out.println(1.2 - 1.1);
        System.out.println(number);
        System.out.println(number++); // System.out.println(number); number++;
        System.out.println(number);
        System.out.println(++number);

        number *= 10;
        System.out.println(number);


//        CONDITIONALS

        number = 101;

        if (number >= 1000) {
            System.out.println("Number es mayor o igual que 1000");
        } else if (number > 0 && number < 1000) {
            System.out.println("Number es mayor que 0 y menor que 1000");
        } else if (number > 100) {
            System.out.println("es mayor que 100. Pero esta condición es inalcanzable");
        } else if (number == 0) {
            System.out.println("number es igual a 0");
        } else {
            System.out.println("Number es menor que 1000");
        }

        if (number > 10 || number < -10) {
            System.out.println("number tiene más de 2 cifras");
        }

        if (number % 2 == 0) System.out.println("number es par");
        else System.out.println("number es impar");

        if (number != 0) System.out.println("number es distinto de 0");

        isBoolean = true;
        if (isBoolean) System.out.println("is boolean es true");


        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }


        double mark = 6.5;
        boolean hasPassed = mark >= 5 ? true : false;


        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMethod();

        String info = getInfo(4);
        System.out.println("info: " + info);

        stringMethods();


//    WRAPPERS

        Integer myInteger = 100;
    }


//    METHODS

    public static void myMethod() {
        System.out.println("this ");
        System.out.println("is ");
        System.out.println("inside ");
        System.out.println("myMethod");
    }

    public static String getInfo(int option) {
        if (option == 1) return "My name is Adrián";
        else if (option == 2) return "This is an Ironhack bootcamp";
        else return "option " + option + " provides no info";
    }


//    STRING METHODS

    public static void stringMethods() {
        String address = "C/ Falsa Nº 123";

        System.out.println("address length: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toUpperCase().replace("A", "-"));

        String address2 = "Gran Vía, 27";

        if (address.equals(address2)) System.out.println("it's the same street");
        else System.out.println("they are different streets");
    }
}