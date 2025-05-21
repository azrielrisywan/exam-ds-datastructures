package com.ujiancode.no4;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key); // duplikat ke kanan
        }

        return root;
    }

    public void inorder() {
        System.out.print("Inorder traversal: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void printTree() {
        printTreeRec(root, "", true);
    }

    // Fungsi untuk mencetak Binary Tree
    private void printTreeRec(Node node, String prefix, boolean isTail) {
        if (node == null) return;

        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);

        // Cek apakah anak ada
        boolean hasLeft = node.left != null;
        boolean hasRight = node.right != null;

        if (hasLeft || hasRight) {
            if (node.right != null) {
                printTreeRec(node.right, prefix + (isTail ? "    " : "│   "), node.left == null);
            }
            if (node.left != null) {
                printTreeRec(node.left, prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }
}
