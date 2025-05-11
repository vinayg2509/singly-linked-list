package com.bridgelabz.linkedlist;

// Generic SingleLinkedList class to implement a singly linked list
public class SingleLinkedList<E> {
    Node head; // Reference to the head node of the list

    private int size; // To track the number of elements in the list

    // Constructor initializes size to 0
    SingleLinkedList() {
        this.size = 0;
    }

    // Inner Node class to represent elements of the list
    class Node<E> {
        E data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor for creating a node with given data
        Node(E data) {
            this.data = data;
            this.next = null;
            size++; // Increment size when a node is created
        }
    }

    // Method to add a node at the beginning of the list
    public void addFirst(E data) {
        Node node = new Node(data); // Create new node with given data

        // If list is empty, set new node as head
        if (head == null) {
            head = node;
        } else {
            // Otherwise, link the new node to current head and update head
            node.next = head;
            head = node;
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        // If list is empty, show a message
        if (head == null) {
            System.out.println("No data found");
            return;
        }

        // Traverse through the list and print the elements
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        // Print the last node without the arrow
        System.out.println(temp.data);
    }

    // Main method to demonstrate linked list functionality
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        // Adding elements to the list
        singleLinkedList.addFirst(70);
        singleLinkedList.addFirst(30);
        singleLinkedList.addFirst(56);

        // Displaying the list
        singleLinkedList.display();

        System.out.println(singleLinkedList.size);
    }
}
