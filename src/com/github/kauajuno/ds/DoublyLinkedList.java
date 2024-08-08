package com.github.kauajuno.ds;

public class DoublyLinkedList {
    Node head;

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtBegin(int value){
        Node new_node = new Node(value);

        if(this.head == null){
            this.head = new_node;
            return;
        }

        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }

    public void insertAtEnd(int value){
        Node new_node = new Node(value);

        if(this.head == null){
            this.head = new_node;
            return;
        }

        Node aux = this.head;

        while(aux.next != null){
            aux = aux.next;
        }

        aux.next = new_node;
        new_node.prev = aux;
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

    public void insertAfter(Node prev, int val){
        if(prev == null){
            System.out.println("ALERT: PREV NODE CANNOT BE NULL");
            return;
        }

        Node aux = new Node(val);
        prev.next.prev = aux;
        aux.next = prev.next;
        aux.prev = prev;
        prev.next = aux;
    }

    public void insertBefore(Node next, int val){
        if(next == null){
            System.out.println("ALERT: NEXT NODE CANNOT BE NULL");
            return;
        }

        if(next == this.head.next){
            insertAtBegin(val);
            return;
        }

        Node aux = new Node(val);
        next.prev.next = aux;
        aux.prev = next.prev;
        aux.next = next;
        next.prev = aux;
    }

    public void removeNode(Node node) {
        if (node == null) {
            System.out.println("ALERT: NODE CANNOT BE NULL");
            return;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }

        node.next = null;
        node.prev = null;
    }

    public void traversal(){
        Node aux = this.head;

        if(aux == null){
            System.out.println("NULL");
        }else{
            System.out.print("NULL <- ");
            while(aux.next != null){
                System.out.print(aux.val);
                System.out.print(" <-> ");
                aux = aux.next;
            }
            System.out.print(aux.val);
            System.out.println(" -> NULL");
        }
    }
}