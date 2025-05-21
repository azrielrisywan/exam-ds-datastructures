package com.ujiancode.no4;

public class Main {
    public static void main(String[] args) {
        int[] data = {20, 17, 12, 14, 27, 9, 23, 20, 21, 27};

        BinarySearchTree bst = new BinarySearchTree();

        for (int value : data) {
            bst.insert(value);
        }

        bst.inorder();         // traversal untuk cek
        System.out.println("Struktur pohon BST:");
        bst.printTree();       // tampilkan BST dengan garis
    }
}

