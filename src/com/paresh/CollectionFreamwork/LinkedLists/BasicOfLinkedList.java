package com.paresh.CollectionFreamwork.LinkedLists;

public class BasicOfLinkedList {

    public static int lengthOfLinkedList(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    // Recursive function for printing LinkedList.
    public static void displayRecursively(Node head){
        if (head == null){
            System.out.println("End");
            return;
        }
        System.out.print(head.data + " --> ");
        displayRecursively(head.next);

        // displayRecursively(head.next);
        // System.out.print(head.data + " --> ");
    }

    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
        }
    }

    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(34);
        Node c = new Node(65);
        Node d = new Node(45);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
        displayRecursively(a);

        System.out.println("Length of LinkedList: " + lengthOfLinkedList(a));
    }
}
