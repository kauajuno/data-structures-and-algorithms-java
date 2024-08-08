package com.github.kauajuno.ds;

public class CircularLinkedList {
    Node head;
    Node tail;

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void insertAtBegin(int value){
        Node new_node = new Node(value);

        if(this.head == null){
            this.head = new_node;
            this.tail = new_node;
            new_node.next = this.head;
            return;
        }

        new_node.next = this.head;
        this.head = new_node;
        this.tail.next = this.head;

    }

    public void traversal(){
        Node aux = this.head;

        if(aux == null){
            System.out.println("NULL");
        }else{
            System.out.print("CC - ");
            do {
                System.out.print(aux.val + " - ");
                aux = aux.next;
            } while (aux != this.head);
            System.out.println("CC");
        }
    }
}
