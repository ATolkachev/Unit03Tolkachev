package com.epam;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sign;
        int x, y;
        int z = 0;

        while (true) {
            System.out.println("Для выхода из приложения в любой момент введите #");
            System.out.println("Введите X: ");
            if (sc.hasNext("#")) {
                System.out.print("Спасибо за работу, приложение закрывается!");
                return;
            }
            x = sc.nextInt();

            System.out.println("Введите Y: ");
            if (sc.hasNext("#")) {
                System.out.print("Спасибо за работу, приложение закрывается!");
                return;
            }
            y = sc.nextInt();

            System.out.println("Введите арифметический оператор: ");
            if (sc.hasNext("#")) {
                System.out.print("Спасибо за работу, приложение закрывается!");
                return;
            }
            sign = sc.next();
            switch (sign) {
                case "+":
                    z = x + y;
                    break;
                case "-":
                    z = x - y;
                    break;
                case "*":
                    z = x * y;
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Деление на 0 запрещено");
                        continue;
                    }
                    z = x / y;
                    break;
                default:
                    System.out.println("Пожалуйста используйте арифметические операторы '*' '/' '+' '-'");
                    continue;
            }
            System.out.println("Результат: " + z);
        }
    }
}