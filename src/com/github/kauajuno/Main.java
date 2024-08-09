package com.github.kauajuno;

import com.github.kauajuno.algorithms.BinarySearch;
import com.github.kauajuno.ds.CircularLinkedList;
import com.github.kauajuno.ds.DoublyLinkedList;
import com.github.kauajuno.ds.LinkedList;

public class Main{
    public static void main(String[] args) {
        int pos = BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1);
        System.out.println(pos);
    }
}