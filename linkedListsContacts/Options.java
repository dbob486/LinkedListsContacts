package com.company.linkedListsContacts;

public class Options extends Phone {
//    private static String name;
//    private static int age;
    private Contacts contacts = new Contacts();
    int age;
    String name;
    Node current;

    //option to add a Contacts
    public void addOption() {
        System.out.println("What is the name of the contact you want to add: ");
        name = scanner.nextLine();
        System.out.println("What is their phone number");
        age = scanner.nextInt();
        scanner.nextLine();
        current = new Node(age, name);
        contacts.insert(current);
        System.out.println("Successfully Added");
        current = current.next;
    }

     //option to Remove contacts
    public void rmOption() {
        if (contacts.head == null)
            System.out.println("You don't have any contacts");
        else {
            printContacts();
            System.out.println("What is the name of the contact you want to delete: ");
            name = scanner.nextLine();
            System.out.println();
            contacts.delete(name);
        }
    }

//    Option to update Contact
    public void updateOption() {
        if (contacts.head == null)
            System.out.println("You don't have any contacts");
        else {
            printContacts();
            System.out.println("What is the name of the contact you want to update: ");
            name = scanner.nextLine();
            System.out.println();
            contacts.update(name);
        }
    }

    public void printContacts() {
        if (contacts.head == null)
            System.out.println("You don't have any contacts");
        else {
            System.out.println("These are the people in your contacts: ");
            contacts.print();
        }
    }

    public void quit() {
        System.exit(0);
    }

}