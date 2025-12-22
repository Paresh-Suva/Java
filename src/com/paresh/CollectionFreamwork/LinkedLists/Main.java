package com.paresh.CollectionFreamwork.LinkedLists;

public class Main {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        list.insertFirst(10);
        list.insertFirst(34);
        list.insertFirst(54);
        list.insertFirst(67);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
    }
}
