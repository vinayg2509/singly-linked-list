package com.bridgelabz.linkedlist;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedListTest
{
    static SingleLinkedList singleLinkedList;
    @BeforeAll
    public static void setUp()
    {
         singleLinkedList= new SingleLinkedList();
        singleLinkedList.addFirst(90);
        singleLinkedList.addFirst(56);
        singleLinkedList.addLast(40);
    }
    @Test
    public void searchNodeTest()
    {
      assertTrue(singleLinkedList.searchNode(30)," No Node with data 30  not found");

    }



}