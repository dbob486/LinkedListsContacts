package com.company.linkedListsContacts;

public class Contacts extends Phone {
    Node head;

    //This will insert the data at the very end of the linked list
    public void insert(Node data) {
        if (head == null)
            head = data;
        else {
            Node last = head;
            while (last.next != null)
                last = last.next;
            last.next = data;
        }
    }

    //May possibly be able to optimize this function using multithreading - would search from both sides at the same time
    public void delete(String data) {
        Node currNode = head, prev = null;

        if ((currNode != null) && currNode.name.equals(data)) {
            head = currNode.next; // Changed head
            System.out.println("Contact deleted xD");
            return;
        }
        while (currNode != null && !currNode.name.equals(data)) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println("Not in your contacts");
            return;
        }
        prev.next = currNode.next;
        System.out.println("Contact deleted xD");
    }

    //Updates the users contact to whatever they want
    public void update(String data) {
        Node currNode = head;

        while (currNode != null && !currNode.name.equals(data))
            currNode = currNode.next;

        if (currNode == null) {
            System.out.println("Not in your contacts");
            return;
        }
        System.out.println("Do you want to change the PHONE NUMBER '1' or their NAME '2' or BOTH '3'");
        int a = scanner.nextInt();
        scanner.nextLine();
        switch (a) {
            case 1:
                System.out.println("What is the new Phone Number: ");
                currNode.phoneNum = scanner.nextInt();
                System.out.println("Contact Updated UwU");
                return;
            case 2:
                System.out.println("What do you want to change the name to: ");
                currNode.name = scanner.nextLine();
                System.out.println("Contact Updated UwU");
                return;
            case 3:
                System.out.println("What do you want to change the name to: ");
                currNode.name = scanner.nextLine();
                System.out.println("What is the new Phone Number: ");
                currNode.phoneNum = scanner.nextInt();
                System.out.println("Contact Updated UwU");
                return;
            default:
                System.out.println("Not a valid input");
                return;
        }
    }

    //This will print the all the data that the contacts is holding
    public void print() {
        Node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.name + " - " + currNode.phoneNum);
            currNode = currNode.next;
        }
    }
}
