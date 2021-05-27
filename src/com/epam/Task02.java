package com.epam;

public class Task02 {

    public static void main(String[] args) {
        int i = 1;
        int r = 1;
        do {
            i+=2;
            r+=i;
        } while (i < 99);
        System.out.println(r);
    }
}