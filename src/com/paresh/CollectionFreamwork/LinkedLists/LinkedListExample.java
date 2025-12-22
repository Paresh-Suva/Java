package com.paresh.CollectionFreamwork.LinkedLists;

public class LinkedListExample {

        Node head;
        //Node class to connect all nodes in link form
        static class Node{
            String Data;
            Node Next;
    
            Node(String Data){
                this.Data = Data;
                this.Next = null;
            }
        }
    
        //Add from FIRST
        public void addFirst(String Data){
            Node newNode = new Node(Data);
         
            if (head == null) {
                head = newNode;
                return;
            }
    
            newNode.Next = head;
            head =newNode;
    
        }
    
        //Add from Last
        public void addLast(String Data){
            Node newNode = new Node(Data);
         
            if (head == null) {
                head = newNode;
                return;
            }
            Node currNode = head;
            while (currNode.Next != null) {
                currNode = currNode.Next;
            }
    
            currNode.Next = newNode;
    
        }
    
        //Print LinkedList.
        public void printList(){
            
            if (head == null) {
                System.out.println("List Is Empty...");
                return;
            }
    
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.Data + " --> ");
                currNode = currNode.Next;
            }
            System.out.println("Null");

        }

        //Delete From First
        public void deleteFirst(){
            if (head == null) {
                System.out.println("The List Is Empty...");
            }
            assert head != null;
            head = head.Next;
        }

        //Delete From Last
        public void deleteLast(){
            if (head == null) {
                System.out.println("The List Is Empty...");
                return;
            }

            if (head.Next == null) {
                head = null;
                return;
            }

            Node secondLast = head;
            Node lastNode = head.Next;
            while (lastNode.Next != null) {
                lastNode = lastNode.Next;
                secondLast = secondLast.Next;
            }
            secondLast.Next = null;

        }

    static void main() {

        LinkedListExample list = new LinkedListExample();
        
        list.addFirst(" is");
        list.addFirst("This");
        list.printList();
        
        list.addLast("Linked");
        list.addLast("List");
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteFirst();
        list.printList();

    }
}
