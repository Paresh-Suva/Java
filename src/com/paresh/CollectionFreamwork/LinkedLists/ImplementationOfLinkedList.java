package com.paresh.CollectionFreamwork.LinkedLists;

public class ImplementationOfLinkedList {

    // NODE CLASS REPRESENTS A SINGLE ELEMENT OF LINKED LIST
    static class Node {
        Node next;   // STORES REFERENCE TO NEXT NODE
        int data;    // STORES DATA OF NODE

        // CONSTRUCTOR TO INITIALIZE NODE WITH DATA
        Node(int data) {
            this.data = data;
        }
    }

    // LINKED LIST CLASS
    public static class LinkedList {
        Node head = null;  // POINTS TO FIRST NODE
        Node tail = null;  // POINTS TO LAST NODE
        int size = 0; // SIZE

        // INSERT A NODE AT THE BEGINNING OF LINKED LIST
        void insertAtBeginning(int value) {
            Node temp = new Node(value);

            // IF LIST IS EMPTY, HEAD AND TAIL BOTH POINT TO NEW NODE
            if (head == null) {
                head = tail = temp;
            } else {
                // OTHERWISE POINT NEW NODE TO CURRENT HEAD
                temp.next = head;
                head = temp;
            }
            size++;
        }

        // INSERT A NODE AT THE END OF LINKED LIST
        void insertAtEnd(int value) {
            Node temp = new Node(value);

            // IF LIST IS EMPTY, HEAD POINTS TO NEW NODE
            if (head == null) {
                head = temp;
            } else {
                // LINK CURRENT TAIL TO NEW NODE
                tail.next = temp;
            }
            // UPDATE TAIL TO NEW NODE
            tail = temp;
            size++;
        }

        // INSERT A NODE AT A SPECIFIC INDEX
        void insertAtGivenIndex(int index, int value) {

            if(index < 0 || index > size){
                System.out.println("Wrong index!");
                return;
            }
            Node temp = head;

            // IF INDEX IS ZERO, INSERT AT BEGINNING
            if (index == 0) {
                insertAtBeginning(value);
                return;
            }

            // IF INDEX IS EQUAL TO SIZE, INSERT AT END
            if (index == size) {
                insertAtEnd(value);
                return;
            }

            // MOVE TEMP TO NODE BEFORE REQUIRED POSITION
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            // CREATE NEW NODE AND ADJUST LINKS
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        // DELETE LAST NODE(DEFAULT)
        void deleteAtGivenIndex(int index) {
            Node temp = head;
            if (index < 0 || index >= size) {
                System.out.println("Wrong index!");
                return;
            }

            if(index==0){
                head = temp.next;
                size--;
                return;
            }

            for(int i=0; i < index-1; i++){
                temp =temp.next;
            }

            temp.next = temp.next.next;
            if (index == size-1)tail = temp;
            size--;

        }

        int getValue(int index){
            Node temp = head;
            for(int i = 0; i < index; i ++){
                temp = temp.next;
            }
            return temp.data;
        }

        // DISPLAY METHOD
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(34);
        linkedList.insertAtEnd(46);
        linkedList.insertAtEnd(87);
        linkedList.insertAtEnd(23);
//        linkedList.display();

        linkedList.insertAtBeginning(122);
        linkedList.insertAtBeginning(12);
//        linkedList.display();

        linkedList.insertAtGivenIndex(3, 90);
//        linkedList.display();

        linkedList.insertAtGivenIndex(0, 100);
        linkedList.insertAtGivenIndex(8, 100);
        linkedList.display();

//        System.out.println("Head: " + linkedList.head.data);
        System.out.println("Tail: " + linkedList.tail.data);

//        System.out.println("Value at index 3 = "+ linkedList.getValue(3));
//        System.out.println("Size of LinkedList is " + linkedList.size);

        System.out.println("Value: " +linkedList.getValue(3));

        linkedList.deleteAtGivenIndex(10);
        linkedList.display();
    }
}
