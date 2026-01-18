package com.paresh.CollectionFreamwork.Trees;

public class Implementation {
    public static class Node{
        Node left;
        Node right;
        int value;

        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(0);

        Node a = new Node(1);
        Node b = new Node(2);
        root.left = a;
        root.right = b;

        Node c = new Node(3);
        Node d = new Node(4);
        a.left = c;
        a.right = d;

        Node e = new Node(5);
        b.right = e;

        display(root);
    }

    public static void display(Node root){
        if(root == null) return;

        System.out.print(root.value + " --> ");
        if(root.left != null) System.out.print(root.left.value + " , ");
        else System.out.print("null ");
        if(root.right != null) System.out.print(root.right.value);
        else System.out.print("null ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
}
