package com.paresh.CollectionFreamwork.Trees;

public class PreInPost {

    public static class Node{
        Node left;
        Node right;
        int value;

        Node(int value){
            this.value = value;
        }
    }

    public static void main(String args[]) {

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
        Node f = new Node(7);
        b.left = e;
        b.right = f;


        System.out.print("Pre-order: ");
        preorder(root);
        System.out.println();

        System.out.print("In-order: ");
        inorder(root);
        System.out.println();

        System.out.print("Post-order: ");
        postorder(root);
        System.out.println();

        int level = height(root) + 1;
        System.out.println("Nth level: ");
        for (int i=1; i<=level; i++) {
            nthLevel(root,i);
            System.out.println();
        }
    }

    public static void preorder(Node root) {
        // Root --> Left --> Right
        if (root == null) return;
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        // Left --> Root --> Right
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        // Left --> Right --> Root
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void nthLevel (Node root, int n){
        if(root == null){
            return;
        }
        if(n == 1){
            System.out.print(root.value + " ");
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }
}
