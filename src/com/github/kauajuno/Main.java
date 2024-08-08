package com.github.kauajuno;

import com.github.kauajuno.ds.DoublyLinkedList;
import com.github.kauajuno.ds.LinkedList;

public class Main{
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBegin(30);
        dll.insertAtBegin(40);
        dll.insertAtBegin(50);
        dll.insertAtEnd(90);
        dll.insertAtEnd(80);
        DoublyLinkedList.Node yeah = dll.getNode(30);
        dll.insertAfter(yeah, 15);
        dll.insertBefore(yeah, 45);

        dll.traversal();

        DoublyLinkedList.Node first = dll.getNode(50);
        DoublyLinkedList.Node last = dll.getNode(80);

        dll.removeNode(first);
        dll.removeNode(last);
        dll.removeNode(yeah);

        dll.traversal();
    }
}