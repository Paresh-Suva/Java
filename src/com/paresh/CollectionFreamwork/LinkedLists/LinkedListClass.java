package com.paresh.CollectionFreamwork.LinkedLists;

public class LinkedListClass {

    private Node head;
    private Node tail;
    private int size;
    LinkedListClass(){
        this.size = 0;
    }

//    Insert at any index position
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }

        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++ ){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

//    Insert at first index(0);
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size++;
    }

//    Insert at last index (n);
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

//    Delete first value(o)
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size++;
        return value;
    }

//    Disply LinkedList
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("The-End");
    }

//    Node class to manage value and nodes
    private class Node{
         private int value;
         private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
