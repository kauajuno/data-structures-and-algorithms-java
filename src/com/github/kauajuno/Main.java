package com.github.kauajuno;

import com.github.kauajuno.ds.LinkedList;

public class Main{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtBegin(20);
        ll.insertAtBegin(30);
        ll.insertAtBegin(40);
        ll.traversal();
        ll.insertAtEnd(50);
        ll.insertAtEnd(60);
        ll.traversal();
        ll.insertAtBegin(70);
        LinkedList.Node example = ll.getNode(20);
        ll.insertAfter(example, 100);
        ll.traversal();
    }
}