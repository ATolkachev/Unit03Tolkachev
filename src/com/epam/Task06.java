package com.epam;

import java.util.Scanner;
import java.util.HashSet;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int a = sc.nextInt();
        System.out.println("Введите число 2: ");
        int b = sc.nextInt();
        String a_s = Integer.toString(a);
        String b_s = Integer.toString(b);
        String c_s = a_s+b_s;
        HashSet<Character> charSet = new HashSet<Character>();
        for (int i=0;i<c_s.length();i++){
            charSet.add(c_s.charAt(i));
        }
        System.out.println(charSet);
    }

}