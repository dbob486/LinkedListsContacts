package com.company.linkedListsContacts;

public class Node {
    Node next;
    int phoneNum;
    String name;

    public Node(int phoneNum, String name) {
        this.phoneNum = phoneNum;
        this.name = name;
    }
}
