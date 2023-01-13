package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    showMenu();



    }

    private static void showMenu() {
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Write a Java program to convert temperature from Fahrenheit to Celsius degree");
            System.out.println("2. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("3. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("4. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("5. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("6. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("7. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("8. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("9. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("10. Write a Java program that reads a number in inches, converts it to meters.");
            System.out.println("0. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Problema 1");
                    solveProblema1();
                    break;
                case 2:
                    System.out.println("Problema 2");
                    solveProblema2();
                    break;
                case 3:
                    System.out.println("Problema 3");
                    solveProblema3();
                    break;
                case 4:
                    System.out.println("Problema 4");
                    solveProblema4();
                    break;
                case 5:
                    System.out.println("Problema 5");
                    solveProblema5();
                    break;
                case 6:
                    System.out.println("Problema 6");
                    solveProblema6();
                    break;
                case 7:
                    System.out.println("Problema 7");
                    solveProblema7();
                    break;
                case 8:
                    System.out.println("Problema 8");
                    solveProblema8();
                    break;
                case 9:
                    System.out.println("Problema 9");
                    solveProblema9();
                    break;
                case 10:
                    System.out.println("Problema 10");
                    solveProblema10();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 3.");
                    break;
            }
        }
    }

    private static void solveProblema10() {
    }

    private static void solveProblema9() {
    }

    private static void solveProblema8() {
    }

    private static void solveProblema7() {
    }

    private static void solveProblema6() {
    }

    private static void solveProblema5() {
    }

    private static void solveProblema4() {
    }

    private static void solveProblema3() {
    }

    private static void solveProblema2() {
        //Write a Java program that reads a number in inches, converts it to meters.
        System.out.print("Introdu valoarea in inch:");
        double inch = input.nextDouble();
        double meters = inch*0.0254;
        System.out.println(inch + " inch in metri va fi: " +meters+" metri");
    }

    private static void solveProblema1() {
        //Write a Java program to convert temperature from Fahrenheit to Celsius degree

        double fahrenheit, celsius;
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        // Convertire in Celsius
        celsius = (fahrenheit - 32) * 5/9;

        // Afisare rezultat
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
    }
}