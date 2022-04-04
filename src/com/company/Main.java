package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tasks could be done with scanner too

        //task1and2(); //even or odd
        //task3(); //<,> or = to 0
        //task4(); //height and weight
        //task5(); //Celsius to Fahrenheit
        //task6(); //Taxes
        task7(); //Loan
    }

    static void task1and2() {
        int a = 12;
        if (a % 2 == 0) {
            System.out.println("Number " + a + " is even!");
        } else {
            System.out.println("Number " + a + " is odd!");
        }
    }

    static void task3() {
        int b = 8;
        if (b > 0) {
            System.out.println("Number " + b + " is greater than 0!");
        } else if (b < 0) {
            System.out.println("Number " + b + " is less than 0!");
        } else {
            System.out.println("Number " + b + " is equal to 0!");
        }
    }

    static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your height in cm");
        int height = scanner.nextInt();
        System.out.println("Input your weight in kg");
        float weight = scanner.nextFloat();

        if (height > 150 && weight < 180) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
        }

    }

    static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input temperature in Celsius");
        float tempinCelsius = scanner.nextFloat();
        float tempinFahrenheit = (float) 1.8 * tempinCelsius + 32;
        System.out.println(tempinCelsius + " degrees in Celsius equals to " + tempinFahrenheit + " degrees in Fahrenheit");
    }

    static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your income");
        double income = scanner.nextDouble();

        //if(income<85528.00)
    }

    static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount");
        double amount = scanner.nextDouble();
        System.out.println("Input number of installments");
        int numofInstall = scanner.nextInt();

        if ((amount < 100.00 || amount > 10000.00) || (numofInstall < 6 || numofInstall > 48)) {

        }
    }

}
