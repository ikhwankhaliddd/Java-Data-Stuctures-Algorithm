package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        System.out.println(num1);

        // Type casting adalah cara untuk mengkonversi tipe data di java
        int num2 = (int)65.44134f;
        System.out.println(num2);

//        int a = 257;
//        byte b = (byte) a;
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);
//
//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d-s);
        System.out.println(result);

    }
}
