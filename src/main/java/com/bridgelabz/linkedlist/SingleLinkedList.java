package com.bridgelabz.linkedlist;

// Generic SingleLinkedList class to implement a singly linked list
 class SingleLinkedList<E extends  Comparable<E>>  {
    Node<E> head; // Reference to the head node of the list

    private int size; // To track the number of elements in the list

    // Constructor initializes size to 0
    SingleLinkedList() {
        this.size = 0;
    }

    // Inner Node class to represent elements of the list
    class Node<E extends  Comparable<E>> {
        E data; // Data stored in the node
        Node<E> next; // Reference to the next node

        // Constructor for creating a node with given data
        Node(E data) {
            this.data = data;
            this.next = null;
            size++; // Increment size when a node is created
        }
    }

    // Method to add a node at the beginning of the list
    public void addFirst(E data) {
        Node<E> node = new Node(data); // Create new node with given data

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

    public boolean searchNode(E data)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return false;
        }

        Node currentNode=head;
        while (currentNode!=null)
        {
            if(currentNode.data.equals(data))
            {

                return true;
            }
            currentNode = currentNode.next;
        }
       return  false;

    }

    public boolean insertAfter(E positionData,E data)
    {
        if(head==null)
        {
            return false;
        }
        Node node= new Node(data);
        Node currentNode=head;
        while (currentNode!=null)
        {
            if(currentNode.data.equals(positionData))
            {
               node.next=currentNode.next;
               currentNode.next=node;
               return  true;
            }
         currentNode=   currentNode.next;
        }

        System.out.println("Element "+positionData+" is not present in list");

        return false;
    }

    public boolean delete(E data)
    {
        if(head==null)
        {
            System.out.println("List is empty....!");
            return  false;
        }

        if(head.data.equals(data))
        {
            head=head.next;
            return true;
        }
        Node currentNode= head;
        while (currentNode!=null)
        {
            if(currentNode.next.data.equals(data))
            {
                currentNode.next=currentNode.next.next;
                System.out.println("Size of list "+size());
                return true;
            }
            currentNode=currentNode.next;
        }

        System.out.println("Size of list "+size());
        return false;
    }

    public int size()
    {
        if(head==null)
        {
            return 0;
        }
        int size=0;
        Node currentNode=head;
        while (currentNode.next!=null)
        {
            size++;
            currentNode=currentNode.next;
        }

        return ++size;
    }

    public <E extends Comparable> void sortAscending()
    {
        if(head==null||head.next==null)
        {
            System.out.println("List is too short to sort");
            return;
        }

        for (int i=0;i<size();i++)
        {
            Node currentNode=head;
            while (currentNode.next!=null)
            {
                if(currentNode.data.compareTo(currentNode.next.data)>0)
                {
                    Comparable swap=currentNode.data;
                    currentNode.data=currentNode.next.data;
                    currentNode.next.data = swap;
                }
                currentNode=currentNode.next;

            }
        }



    }

    // Main method to demonstrate linked list functionality
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();


        singleLinkedList.addFirst(56);

        singleLinkedList.addFirst(70);

        singleLinkedList.insertBetween(30);

        singleLinkedList.addFirst(90);

        // Displaying the list
        singleLinkedList.display();

//        singleLinkedList.insertAfter(70,40);
//        singleLinkedList.display();

        singleLinkedList.sortAscending();
        singleLinkedList.display();

    }

}






