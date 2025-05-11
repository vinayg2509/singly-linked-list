package com.bridgelabz.linkedlist;

import java.util.LinkedList;

public class SingleLinkedList<E>
{
    public static void main(String[] args)
    {
        LinkedList<Integer>linkedList= new LinkedList<>();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        for(Integer list:linkedList)
        {
            System.out.println(list);
        }
    }
}