package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
//        INPUT / OUTPUT

//        System.out.println("Prueba de salida normal por consola");
//        System.err.println("Prueba de salida de error por consola");

        Scanner scanner = new Scanner(System.in);

        String name;
        do {
            System.out.println("Please write your name");
            name = scanner.nextLine();
        } while (name.length() < 3);
        System.out.println("Your name is: " + name);

        System.out.println("Please write your age");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);




//        String ageStr;
//        boolean isValidInput;
//
//        do {
//            System.out.println("Please, write your age");
//            ageStr = scanner.nextLine();
//            isValidInput = true;
//
//            if (ageStr.length() == 0) {
//                isValidInput = false;
//                continue;
//            }
//            for (int i = 0; i < ageStr.length(); i++) {
//                if (ageStr.charAt(i) < '0' || ageStr.charAt(i) > '9') {
//                    System.out.println("Age must be a number");
//                    isValidInput = false;
//                    break;
//                }
//            }
//        } while (!isValidInput);
//
//        int ageNum = Integer.parseInt(ageStr);
//        System.out.println("Age: " + ageNum);



        scanner.close();


//        FILE HANDLING

        String filePath = "src/com/ironhack/w1/d3/fichero.txt";

        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya existía");
        }

        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write("Esto es una linea\n");
        fileWriter.write("Esto es otra linea\n");
        fileWriter.close();

        Scanner fileScanner = new Scanner(file);
        String str = "";
        while (fileScanner.hasNextLine()) {
            str += fileScanner.nextLine() + "\n";
            System.out.println(str);
        }
        fileScanner.close();
    }
}
