package com.github.kauajuno;

import com.github.kauajuno.ds.CircularLinkedList;
import com.github.kauajuno.ds.DoublyLinkedList;
import com.github.kauajuno.ds.LinkedList;

public class Main{
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBegin(20);
        cll.insertAtBegin(30);
        cll.insertAtBegin(40);

        cll.traversal();
    }
}