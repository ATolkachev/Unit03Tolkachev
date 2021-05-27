package com.epam;

public class Task03 {
    public static void main(String[] args) {
        long r = 1;
        for (int i = 2; i < 11; i++) {
            int n = 0;
            for (int j = 1; j <= i; j++) {
                n+=j;
            }
            r*=n;
        }
        System.out.println(r);
    }
}