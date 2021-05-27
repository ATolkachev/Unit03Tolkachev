package com.epam;

public class Task04 {
    public static void main(String[] args) {
        int a = -5;
        int b = 5;
        double c = 0.5;
        double y;
        System.out.println("+-----------------------+");
        System.out.printf("|\t%4s\t|\t%4s\t|\n","x", "y");
        System.out.println("+-----------------------+");

        for (double i = a; i <= b; i += c) {

            y = 5 - Math.pow(i, 2) / 2;
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n",i, y);
        }
        System.out.println("+-----------------------+");
    }
}