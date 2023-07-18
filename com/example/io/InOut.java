package com.example.io;

import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {
        System.out.println("Enter first name:");

        String fn = new Scanner(System.in).next();
        System.out.println("Enter last name:");
        String ln = new Scanner(System.in).next();

        System.out.println("your full name is"+fn +" "+ln);
    }
    
}
