package com.paresh.CollectionFreamwork.LinkedLists;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Add elements to the LinkedList
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("LinkedList after adding elements: " + linkedList);

        // 2. Add an element at the beginning and end
        linkedList.addFirst("Start");
        linkedList.addLast("End");
        System.out.println("LinkedList after adding at beginning and end: " + linkedList);

        // 3. Get elements
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // 4. Remove elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing first and last elements: " + linkedList);

        // 5. Update an element
        linkedList.set(1, "Updated");
        System.out.println("LinkedList after updating element at index 1: " + linkedList);

        // 6. Check if it contains an element
        boolean containsA = linkedList.contains("A");
        System.out.println("Does LinkedList contain 'A'? " + containsA);

        // 7. Size of LinkedList
        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);

        // 8. Iterate over elements
        System.out.println("Iterating through LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // 9. Clear the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);

        // 10. Check if empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);
    }
}
