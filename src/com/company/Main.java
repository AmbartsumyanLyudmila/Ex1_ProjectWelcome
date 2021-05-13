package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your First name: ");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        System.out.println("Enter your Last name: ");
        String lastName = scan.next();
        System.out.println("Welcome, ");
        System.out.println(firstName+ " " + lastName);
    }
}
