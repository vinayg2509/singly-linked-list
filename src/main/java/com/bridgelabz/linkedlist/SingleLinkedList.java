package com.bridgelabz.linkedlist;

// Generic SingleLinkedList class to implement a singly linked list
 class SingleLinkedList<E> {
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

    // Method to add a new node with the given data at the end of the list
    public void addLast(E data) {
        // Create a new node with the provided data
        Node node = new Node(data);

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = node;
            return;
        }

        // Traverse the list to find the last node
        Node currentNode = head;
        while (currentNode.next != null) {  // Fix: stop at the last node, not after it
            currentNode = currentNode.next;
        }


        // Set the next of the last node to the new node
        currentNode.next = node;
    }

    public void insertBetween(E data)
    {
        Node node= new Node(data);

        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head.next=head;
            return;
        }
        Node currentNode=head;
        for(int i=1;i<size/2;i++)
        {
            currentNode=currentNode.next;
        }
        node.next=currentNode.next;
        currentNode.next=node;

    }

    public void deleteFirst()
    {
        if(head==null)
        {
            return;
        }
        head=head.next;
        size--;
    }

    public void deleteLast()
    {
        if(head==null)
        {
            return;
        }
        size--;
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }

    public Node searchNode(E data)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return null;
        }

        Node currentNode=head;
        while (currentNode!=null)
        {
            if(currentNode.data.equals(data))
            {
                //System.out.println(data +" data is present ,.....");
                return currentNode;
            }
            currentNode = currentNode.next;
        }
       return  currentNode;

    }



    // Main method to demonstrate linked list functionality
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();


        singleLinkedList.addFirst(56);

        singleLinkedList.addLast(70);

        singleLinkedList.insertBetween(30);

        // Displaying the list
        singleLinkedList.display();

        System.out.println(singleLinkedList.size);


    }

}






