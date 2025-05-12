package com.bridgelabz.linkedlist;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedListTest
{
    @Test
    public void searchNodeFoundTest()
    {
        SingleLinkedList singleLinkedList= new SingleLinkedList();
        singleLinkedList.addFirst(90);
        singleLinkedList.addFirst(56);
        singleLinkedList.addLast(30);

       SingleLinkedList.Node actualResult=singleLinkedList.searchNode(30);
       assertEquals(30,actualResult.data,"Node with value 30 found");

    }
    @Test
    public void searchNodeNotFoundTest() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(90);
        singleLinkedList.addFirst(56);
        singleLinkedList.addLast(40);

        SingleLinkedList.Node actualResult = singleLinkedList.searchNode(30);

        assertNull(actualResult, "Node with value 30 should not be found");
    }


}