package com.company.linkedListsContacts;

import java.util.Scanner;

public class Phone {
    public static Scanner scanner = new Scanner(System.in);
    private static Options option = new Options();


    public static void main(String[] args) {
        choice();
    }

    private static void choice() {
        System.out.println("\nDo you want to: \n-'ADD' Add a contact * \n- 'RM' Remove a contact * \n- 'UPDATE' Update a contact' *\n- 'PRINT' Print your contacts *\n- 'Q' Quit ");
        String c = scanner.nextLine();
        switch (c.toLowerCase()) {
            case "add":
                option.addOption();
                choice();
                System.out.println();
            case "rm":
                option.rmOption();
                choice();
                System.out.println();
            case "update":
                option.updateOption();
                choice();
                System.out.println();
            case "print":
                option.printContacts();
                choice();
                System.out.println();
            case "q":
                option.quit();
                break;
            default:
                System.out.println("");
                choice();
        }
    }
}