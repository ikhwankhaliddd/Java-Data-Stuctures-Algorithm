package com.company;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some number: ");
        int rollno = input.nextInt();
        System.out.println("Your number is : " + rollno);

        int a = 10; // a itu identifier dan 10 itu literal

        int b = 100_000_000; // _ berfungsi sebagai pemisah

        float nilai = input.nextFloat();
        System.out.println(nilai);
    }
}
