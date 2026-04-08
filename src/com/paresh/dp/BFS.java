package com.paresh.dp;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static void main(String[] args) {
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


        bfs(root);
    }

    public static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() != 0) {

            Node temp = queue.peek();

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }

            System.out.print(temp.value + " ");
            queue.remove();
        }
    }

    public static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }
    }
}
