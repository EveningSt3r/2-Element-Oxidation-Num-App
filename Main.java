package Chimera.tech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        subscript sub = new subscript();
        System.out.println("Welcome to the Oxidation Number Command Line Application");
        System.out.println("This is a work-in progress part of a bigger application, dealing with compounds with Oxygen in them.");
        System.out.println("Assume that the second element in your compound is Oxygen.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter elements abbreviated: (Cr or Fe) ");
        System.out.println("What is your first element?");
        String elem1 = scanner.nextLine();


        System.out.println("What is your first element's subscript? (Enter 1 if none)");
        int sub1 = scanner.nextInt();

        System.out.println("What is Oxygen's subscript? (Enter 1 if none)");
        int sub2 = scanner.nextInt();

        System.out.println("What is your charge? Write negative charges with the negative sign out front please (-2)");
        System.out.println("If no charge: Please enter 0 ");
        int charge = scanner.nextInt();

        String sub3 = sub.generateSubscript(sub1);
        String sub4 = sub.generateSubscript(sub2);

        System.out.println("Your compound is: " + elem1 + sub3 + "O" + sub4 + charge);
        int OxygenNumber = (sub2 * -2);
        int ElementNumber = (charge - OxygenNumber);

        System.out.println("Your Oxidation number for " + elem1 + " is: " + ElementNumber + " Your Oxidation Number for Oxygen is: " + OxygenNumber);




    }

}
