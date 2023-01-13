package org.example;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

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
            System.out.println("3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.");
            System.out.println("4. Write a Java program to convert minutes into a number of years and days.");
            System.out.println("5. Write a Java program that prints the current time in GMT.");
            System.out.println("6. Write a Java program to compute body mass index (BMI).");
            System.out.println("7. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product etc.");
            System.out.println("8. Write a Java program that reads a number and display the square, cube, and fourth power.");
            System.out.println("9. Write a Java program to compute the floor division and the floor modulus of the given dividend and divisor.");
            System.out.println("10. Write a Java program to get the next floating-point adjacent in the direction of positive and negative infinity from a given float/double number.");
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
                    System.out.println("Invalid choice. Please select a number between 1 and 10.");
                    break;
            }
        }
    }

    private static void solveProblema10() {
        //Write a Java program to get the next floating-point adjacent in the direction of positive and negative infinity from a given float/double number.
        try{
            float fn = 0.2f;
            System.out.println("\nInitial floating number: " + fn);
            float next_down_fn = Math.nextDown(fn);
            float next_up_fn = Math.nextUp(fn);
            System.out.println("Float " + fn + " next down is " + next_down_fn);
            System.out.println("Float " + fn + " next up is " + next_up_fn);
            double dn = 0.2d;
            System.out.println("\nInitial double number: " + dn);
            double next_down_dn = Math.nextDown(dn);
            double next_up_dn = Math.nextUp(dn);
            System.out.println("Double " + dn + " next down is " + next_down_dn);
            System.out.println("Double " + dn + " next up is " + next_up_dn);

        }catch(NumberFormatException e){
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema9() {
        //Write a Java program to compute the floor division and the floor modulus of the given dividend and divisor
        try{
            int dividend, divisor, floorDivision, floorModulus;

            // Get dividend and divisor from user
            System.out.print("Enter the dividend: ");
            dividend = input.nextInt();
            System.out.print("Enter the divisor: ");
            divisor = input.nextInt();

            // Perform floor division and floor modulus
            floorDivision = dividend / divisor;
            floorModulus = dividend % divisor;

            // Print the results
            System.out.println("Floor division: " + floorDivision);
            System.out.println("Floor modulus: " + floorModulus);
        }catch(NumberFormatException e){
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema8() {
        //Write a Java program that reads a number and display the square, cube, and fourth power
        try{
            double num, square, cube, fourthPower;

            // Get number from user
            System.out.print("Enter a number: ");
            num = input.nextDouble();

            // Calculate the powers
            square = num * num;
            cube = num * num * num;
            fourthPower = Math.pow(num, 4);

            // Print the results
            System.out.println("Square: " + square);
            System.out.println("Cube: " + cube);
            System.out.println("Fourth power: " + fourthPower);


        }catch(NumberFormatException e){
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema7() {
        //Write a Java program that accepts two integers from the user and then prints the sum, the difference,
        // the product, the average, the distance (the difference between integer),
        // the maximum (the larger of the two integers), the minimum (smaller of the two integers).
        try{
            int num1, num2, sum, difference, product, average, distance, max, min;

            // Get numbers from user
            System.out.print("Enter first integer: ");
            num1 = input.nextInt();
            System.out.print("Enter second integer: ");
            num2 = input.nextInt();

            // Perform operations
            sum = num1 + num2;
            difference = num1 - num2;
            product = num1 * num2;
            average = (num1 + num2) / 2;
            distance = Math.abs(num1 - num2);
            max = Math.max(num1, num2);
            min = Math.min(num1, num2);

            // Print results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Average: " + average);
            System.out.println("Distance: " + distance);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " +min);

        }catch(NumberFormatException e){
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema6() {
        //Write a Java program to compute body mass index (BMI)
        try{
            double weight, height, bmi;

            // Get weight and height from user
            System.out.print("Enter your weight in kg: ");
            weight = input.nextDouble();
            System.out.print("Enter your height in meters: ");
            height = input.nextDouble();

            // Calculate BMI
            bmi = weight / (height * height);

            // Print the result
            System.out.println("Your BMI is: " + bmi);

        }catch(NumberFormatException e){
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema5() {
        //Write a Java program that prints the current time in GMT
        try{
            System.out.print("Input the time zone offset to GMT: ");
            long timeZoneChange = input.nextInt();
            long totalMilliseconds = System.currentTimeMillis();

            long totalSeconds = totalMilliseconds / 1000;

            long currentSecond = totalSeconds % 60;

            long totalMinutes = totalSeconds / 60;

            long currentMinute = totalMinutes % 60;

            long totalHours = totalMinutes / 60;

            long currentHour = ((totalHours + timeZoneChange) % 24);

            System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);


        }catch(NumberFormatException e){
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema4() {
        //Write a Java program to convert minutes into a number of years and days.
        try{
            int minutes, days, years;

            // Get minutes from user
            System.out.print("Enter the number of minutes: ");
            minutes = input.nextInt();

            // Convert minutes to years and days
            years = minutes / 525600;
            days = (minutes % 525600) / 1440;

            // Print the result
            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        }catch(NumberFormatException e){
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema3() {
        //Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer
        try{
            System.out.print("Enter integer number: ");
            int num = input.nextInt();
            int sum = (num % 10) + (num /10)%10+(num/100)%10 +(num/1000)%10;
            System.out.println("The number: " + num +" The sum of the digits is: " +sum);

        }catch(NumberFormatException e){
            System.out.println("Error, incorect number");
        }
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