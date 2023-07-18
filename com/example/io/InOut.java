package com.example.io;

import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {
        System.out.println("Enter a number");

        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter the next number");
        int b = new Scanner(System.in).nextInt();

        System.out.println("sum="+ (a+b));
    }
    
}
