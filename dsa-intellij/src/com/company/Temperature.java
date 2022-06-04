package com.company;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Temperature in C :");
        float tempC = input.nextFloat();

        float tempF = (9/5 * tempC) + 32;

        System.out.println(tempF);
    }
}
