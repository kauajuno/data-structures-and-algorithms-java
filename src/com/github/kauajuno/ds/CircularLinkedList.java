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
        this.tail.next = this.head;
        this.head = new_node;


    }

    public void insertAtEnd(int value){
        Node new_node = new Node(value);

        if(this.head == null){
            this.head = new_node;
            this.tail = new_node;
            new_node.next = this.head;
            return;
        }

        new_node.next = this.head;
        this.tail.next = new_node;
        this.tail = new_node;

    }

    public Node getNode(int value){
        Node aux = this.head;

        while(aux != null){
            if(aux.val == value){
                return aux;
            }
            aux = aux.next;
        }

        System.out.println("ALERT: NODE NOT FOUND");
        return null;
    }

    public void insertAfter(Node prev, int value){
        if(prev == null){
            System.out.println("ALERT: PREV NODE CANNOT BE NULL");
            return;
        }

        if(prev == this.tail){
            insertAtEnd(value);
        }

        Node new_node = new Node(value);

        new_node.next = prev.next;
        prev.next = new_node;
    }

    public void traversal(){
        Node aux = this.head;

        if(aux == null){
            System.out.println("NULL");
        }else{
            System.out.print("CC -> ");
            do {
                System.out.print(aux.val + " -> ");
                aux = aux.next;
            } while (aux != this.head);
            System.out.println("CC");
        }
    }
}
