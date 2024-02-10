package com.example;
import java.util.Scanner;

public class Main {
    static Scanner sc;

    private static void addition() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Result: ");
    }

    private static void subtraction() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Result: ");
    }

    private static void multiplication() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Result: ");
    }

    private static void division() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Result: ");
    }

    private static void squareRoot() {
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        System.out.println("Result: ");
    }

    private static void factorial() {
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.println("Result: ");
    }

    private static void naturalLog() {
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        System.out.println("Result: ");
    }

    private static void exponentiation() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Result: ");
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.println("----------------------------------------------");
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 for square root");
            System.out.println("Enter 6 for factorial");
            System.out.println("Enter 7 for natural log");
            System.out.println("Enter 8 for exponentiation");
            System.out.println("Enter -1 to quit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();
            switch(option) {
                case -1:
                    run = false;
                    break;
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    squareRoot();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    naturalLog();
                    break;
                case 8:
                    exponentiation();
                    break;
            }
            System.out.println();
        }

        sc.close();
    }
}