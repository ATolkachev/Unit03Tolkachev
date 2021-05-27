package com.epam;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = sc.nextDouble();
        System.out.println("Введите b: ");
        double b = sc.nextDouble();
        System.out.println("Введите h: ");
        double h = sc.nextDouble();
        double r;

        System.out.println("+-------------------------------+");
        System.out.printf("|\t\t%2s\t\t|\t%6s\t\t|\n", "x", "f(x)");

        for (double i = a; i < b+h; i += h) {

            r = 2 * Math.tan(i / 2) + 1;
            System.out.println("+-------------------------------+");
            System.out.printf("|\t\t%-4.2f\t|\t%-10f\t|\n", i, r);
        }
        System.out.println("+-------------------------------+");
    }
}