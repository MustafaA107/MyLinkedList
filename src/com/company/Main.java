package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
    MyLinkedList myLinkedList=new MyLinkedList();
    myLinkedList.add(12);
    myLinkedList.add(20);
    myLinkedList.addFirst(5);
        System.out.println( new String(String.valueOf(myLinkedList)));
    }
}
