package com.epam;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите римскую цифру:");
        String r = sc.nextLine();
        int x = 0;
        switch (r) {
            case "I":
                x = 1;
                break;
            case "V":
                x = 5;
                break;
            case "X":
                x = 10;
                break;
            case "L":
                x = 50;
                break;
            case "C":
                x = 100;
                break;
            case "D":
                x = 500;
                break;
            case "M":
                x = 1000;
                break;
            default:
                System.out.println("Ошибка! Неправильный ввод!");
                return;
        }
        System.out.println("Римская цифра " + r + " равна " + x);
    }
}