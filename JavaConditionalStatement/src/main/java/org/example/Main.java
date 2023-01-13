package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Java Conditional statement");
        showMenu();
    }

    private static void showMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Write a Java program to get a number from the user and print whether it is positive or negative");
            System.out.println("2. Write a Java program to solve quadratic equations (use if, else if and else)");
            System.out.println("3. Take three numbers from the user and print the greatest number");
            System.out.println("4. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.");
            System.out.println("5. Write a Java program to find the number of days in a month.");
            System.out.println("6. Write a program in Java to display the multiplication table of a given integer.");
            System.out.println("7. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.");
            System.out.println("8. Write a Java program to display the number rhombus structure.");
            System.out.println("9. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.");
            System.out.println("10. Write a program in Java to display the cube of the number upto given an integer..");
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
        //Write a program in Java to display the cube of the number upto given an integer.
        try {
            System.out.print("Input number of terms : ");
            Scanner in = new Scanner(System.in);
            int n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));
            }

        } catch (NumberFormatException e) {
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema9() {
        //Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
        try {
            if (input.hasNextLong()) {

                long n = input.nextLong();

                if (n < 0) {
                    n *= -1;
                }
                int digits = 0;
                while (n != 0) {
                    n /= 10;
                    digits++;
                }
                System.out.println("Number of digits in the number: " + digits);
            } else {
                System.out.println("The number is not an integer");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema8() {
        //Write a Java program to display the number rhombus structure
        try {
            System.out.print("Input the number:  ");
            int n = input.nextInt();
            int count = 1;
            int no_of_spaces = 1;
            int start = 0;

            for (int i = 1; i < (n * 2); i++) {
                for (int spc = n - no_of_spaces; spc > 0; spc--) {
                    System.out.print(" ");
                }
                if (i < n) {
                    start = i;
                    no_of_spaces++;
                } else {
                    start = n * 2 - i;
                    no_of_spaces--;
                }
                for (int j = 0; j < count; j++) {
                    System.out.print(start);
                    if (j < count / 2) {
                        start--;
                    } else {
                        start++;
                    }
                }
                if (i < n) {
                    count = count + 2;
                } else {
                    count = count - 2;
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema7() {
        //Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row
        try {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= (num - i); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema6() {
        //Write a program in Java to display the multiplication table of a given integer
        try {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema5() {
        //Write a Java program to find the number of days in a month
        try {
            System.out.print("Input month: ");
            int month = input.nextInt();
            System.out.print("Input year: ");
            int year = input.nextInt();
            int days = daysInMonth(month, year);
            System.out.println("Number of days in month " + month + " and year " + year + ": " + days);

        } catch (NumberFormatException e) {
            System.out.println("Error, incorect number");
        }
    }

    private static int daysInMonth(int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.YEAR, year);
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return days;
    }

    private static void solveProblema4() {
        //Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
        try {
            int num;
            System.out.print("Enter a number: ");
            num = input.nextInt();
            switch (num) {
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
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }

        } catch (NumberFormatException e) {
            System.out.println("Error, incorect number");
        }
    }

    private static void solveProblema3() {
        //Take three numbers from the user and print the greatest number
        try {
            int num1, num2, num3;

            // Get numbers from user
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();
            System.out.print("Enter third number: ");
            num3 = input.nextInt();

            // Find the greatest number
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("The greatest number is: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The greatest number is: " + num2);
            } else {
                System.out.println("The greatest number is: " + num3);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, incorect number");
        }

    }

    private static void solveProblema2() {
        //Write a Java program to get a number from the user and print whether it is positive or negative
        int num;

        // Get number from user
        System.out.print("Enter a number: ");
        num = input.nextInt();

        // Check if number is positive or negative
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }
    }

    private static void solveProblema1() {
        //Write a Java program to solve quadratic equations (use if, else if and else)

        double a, b, c, discriminant, root1, root2;

        // Get coefficients from user
        System.out.print("Enter coefficient a: ");
        a = input.nextDouble();
        System.out.print("Enter coefficient b: ");
        b = input.nextDouble();
        System.out.print("Enter coefficient c: ");
        c = input.nextDouble();

        // Calculate discriminant
        discriminant = b * b - 4 * a * c;

        // Check number of solutions
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two real solutions: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("The equation has one real solution: " + root1);
        } else {
            System.out.println("The equation has no real solutions.");
        }
    }
}