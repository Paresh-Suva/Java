package com.paresh.CollectionFreamwork.Trees;

public class BasicQuestion {
    public static class Node{
        Node left;
        Node right;
        int value;

        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(6);
        b.right = e;

        System.out.println("Size: " + size(root));

        System.out.println("Height: " + height(root));

        System.out.println("Sum: " + sum(root));

        System.out.println("Max: " + max(root));

        System.out.println("Min: " + min(root));

        System.out.println("Product: " + product(root));

    }

    public static int size(Node root){
        if(root == null) {
            return 0;
        }
        return 1 + size(root.left) + size((root.right));
    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int sum(Node root){
        if(root == null) {
            return 0;
        }
        return root.value + sum(root.left) + sum((root.right));
    }

    public static int max(Node root){
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value, Math.max(max(root.left), max(root.right)));
    }

    public static int min (Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.value, Math.min(min(root.left), min(root.right)));
    }

    public static int product(Node root) {
        if (root == null) {
            return 1;
        }
        return root.value * product(root.left) * product(root.right);
    }
}
